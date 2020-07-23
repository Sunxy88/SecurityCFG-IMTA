package xisong;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.authc.UsernamePasswordToken;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.legacy.NameFilter;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.path.CtRole;
import spoon.template.TemplateMatcher;
import spoon.template.TemplateParameter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurityElementMatcher {
    private TemplateParameter<Subject> _subject_;
    private TemplateParameter<UsernamePasswordToken> _token_;
    private TemplateParameter<String> _string_;
    private SpoonAPI driverSpoon;
    private String folder;

    public SecurityElementMatcher(String folder) {
        this.folder = folder;
        this.driverSpoon = new Launcher();
        this.driverSpoon.addInputResource(this.folder);
        this.driverSpoon.buildModel();
    }

    /*
    * Get specific statements according to a given statement.
    * */
    public List<CtElement> getStatements(String target, String filter) {
        CtClass<?> templateClass = driverSpoon.getFactory().Class().get(SecurityElementMatcher.class);
        CtStatement templateRoot = ((CtMethod) templateClass
                .getElements(new NameFilter(filter))
                .get(0)).getBody()
                .getStatement(0);
        TemplateMatcher matcher = new TemplateMatcher(templateRoot);

        SpoonAPI targetDriver = new Launcher();
        targetDriver.addInputResource(target);
        targetDriver.buildModel();

        return new ArrayList<>(matcher.find(targetDriver.getModel().getRootPackage()));
    }

    public List<CtElement> getLoginStatements(String target) {
        return getStatements(target, LOGIN);
    }

    public List<CtElement> hasRoleStatements(String target) {
        return getStatements(target, ROLE);
    }

    public List<CtElement> isAuthenticatedStatements(String target) {
        return getStatements(target, AUTHENTICATED);
    }

    /*
    * Get if statement by a filter.
    * */
    public List<CtIf> getIfStatements(String target, String filter) {
        List<CtElement> originElements = getStatements(target, filter);
        Set<CtIf> ifElements = new HashSet<>();
        for (CtElement element : originElements) {
            ifElements.add(element.getParent((CtIf ctif) -> true));// Using this filter could get if structures we want.
        }
        return new ArrayList<>(ifElements);
    }

    public List<CtIf> getIfLoginStatements(String target) {
        return getIfStatements(target, LOGIN);
    }

    public List<CtIf> hasIfRoleStatements(String target) {
        return getIfStatements(target, ROLE);
    }

    public List<CtIf> ifIsAuthenticatedStatements(String target) {
        return getIfStatements(target, AUTHENTICATED);
    }

    public void loginMatcher() {
        this._subject_.S().login(this._token_.S());
    }

    public void hasRoleMatcher() {
        _subject_.S().hasRole(_string_.S());
    }

    public void isAuthenticatedMatcher() {
        _subject_.S().isAuthenticated();
    }

    /*
    * Get all statements in an if block corresponding to each role.
    * */
    public Map<String, Set<CtStatement>> roleStatementMap(String target) {
        List<CtIf> ifStructures = hasIfRoleStatements(target);
        Map<String, Set<CtStatement>> roleStatements = new HashMap<>();
        String pattern = "\\w+";
        List<String> tempRoles;
        for (CtIf ifs : ifStructures) {
            tempRoles = new ArrayList<>();
            String regex = ifs.getDirectChildren().get(0).toString();
            Matcher m = Pattern.compile(pattern).matcher(regex);
            boolean methodCalled = false;
            while (m.find()) {
                String temp = m.group();
                if (methodCalled) {
                    tempRoles.add(temp);
                    methodCalled = false;
                }
                if (temp.equals("hasRole")) {
                    methodCalled = true;
                }
            }
            List<CtStatement> tempElement = new LinkedList<>();
            List<CtStatement> allElement = ifs.getElements((CtStatement statement) -> true);
            for (CtStatement statement : allElement) {
                if (!(statement instanceof CtIf)
                        && statement.toString().contains("{")
                        && statement.toString().contains("hasRole")) {
                    tempElement.add(statement);
                }
            }
            for (String role : tempRoles) {
                Set<CtStatement> t = roleStatements.get(role);
                if (t == null) {
                    roleStatements.put(role, new HashSet<>(tempElement));
                } else {
                    t.addAll(tempElement);
                    roleStatements.put(role, t);
                }
            }
        }
        return roleStatements;

    }

    public static final String LOGIN = "loginMatcher";
    public static final String ROLE = "hasRoleMatcher";
    public static final String AUTHENTICATED = "isAuthenticatedMatcher";
}

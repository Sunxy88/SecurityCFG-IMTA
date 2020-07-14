package xisong;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.authc.UsernamePasswordToken;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.legacy.NameFilter;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.template.TemplateMatcher;
import spoon.template.TemplateParameter;

import java.util.ArrayList;
import java.util.List;

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

    public List<CtElement> getStatements(String target, String filter) {
        CtClass<?> templateClass = driverSpoon.getFactory().Class().get(SecurityElementMatcher.class);
        CtStatement templateRoot = ((CtMethod) templateClass.getElements(new NameFilter(filter)).get(0)).getBody().getStatement(0);
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

    public void loginMatcher() {
        this._subject_.S().login(this._token_.S());
    }

    public void hasRoleMatcher() {
        _subject_.S().hasRole(_string_.S());
    }

    public static final String LOGIN = "loginMatcher";
    public static final String ROLE = "hasRoleMatcher";
}

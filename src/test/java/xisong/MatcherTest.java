package xisong;

import fr.inria.SpoonMetaFactory;
import org.junit.Test;
import spoon.SpoonAPI;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.processing.Processor;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTry;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.Filter;
import spoon.support.QueueProcessingManager;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    @Test
    public void loginMatcherTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/1/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        List<CtElement> elements = securityElementMatcher.getLoginStatements(targetFolder);
        for (CtElement element : elements) {
            System.out.println(element);
        }
    }

    @Test
    public void hasRoleMatcherTest3() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/5/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        List<CtElement> elements = securityElementMatcher.hasRoleStatements(targetFolder);
        for (CtElement element : elements) {
            System.out.println(element);
        }
    }

    /*
    * Obtain the block where hasRole() is called by using a filter.
    * */
    @Test
    public void hasRoleMatcherTest2() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/3/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        List<CtElement> elements = securityElementMatcher.hasRoleStatements(targetFolder);
        for (CtElement element : elements) {
            System.out.println(element.getParent((CtIf ctIf) -> true));
        }
    }

    @Test
    public void ifHasRoleMatcherTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/3/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        List<CtIf> elements = securityElementMatcher.hasIfRoleStatements(targetFolder);
        CtElement element = elements.get(0).getDirectChildren().get(1);
        System.out.println(element.getElements((CtStatement statement) -> true));

//        for (CtIf element : elements) {s
//            System.out.println(element.getDirectChildren());
//        }
    }

    @Test
    public void roleStatementMapTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/8/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        Map<String, Set<CtStatement>> roleStatements = securityElementMatcher.roleStatementMap(targetFolder);
        for (Map.Entry<String, Set<CtStatement>> entry : roleStatements.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Test
    public void tryStatementTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/8/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        List<CtTry> tryList = securityElementMatcher.getTryStatements(targetFolder, SecurityElementMatcher.LOGIN);
        for (CtTry tr : tryList) {
            System.out.println(tr);
        }
    }

    @Test
    public void methodStatementTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/11/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        Map<String, Set<CtStatement>> map = securityElementMatcher.methodStatementMap(targetFolder);
        System.out.println(map);
    }

    @Test
    public void roleAndStatementMapTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/11/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        Map<String, Set<CtStatement>> map = securityElementMatcher.roleStatementMap(targetFolder);
        System.out.println(map);
    }
}

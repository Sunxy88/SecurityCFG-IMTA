package xisong;

import org.junit.Test;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtElement;

import java.util.List;

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
        String targetFolder = this.getClass().getResource("/shiro-example/7/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        List<CtElement> elements = securityElementMatcher.hasIfRoleStatements(targetFolder);
        for (CtElement element : elements) {
            System.out.println(element);
        }
    }
}

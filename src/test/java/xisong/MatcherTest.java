package xisong;

import org.junit.Test;
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
    public void hasRoleMatcherTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/2/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        List<CtElement> elements = securityElementMatcher.hasRoleStatements(targetFolder);
        for (CtElement element : elements) {
            System.out.println(element);
        }
    }
}

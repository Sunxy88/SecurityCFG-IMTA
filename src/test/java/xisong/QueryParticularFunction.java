package xisong;

import org.junit.Test;
import static org.junit.Assert.*;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.filter.AbstractFilter;

import java.net.URISyntaxException;
import java.util.List;

public class QueryParticularFunction {
    private final String folder = this.getClass().getResource("/control-flow/QueryTest").toURI().getPath();
    private SpoonAPI spoon = new Launcher();

    public QueryParticularFunction() throws URISyntaxException {
        this.spoon.addInputResource(folder);
        this.spoon.buildModel();
    }

    public List<CtMethod> getParticularMethod(String target) {
        Factory factory = spoon.getFactory();
        CtPackage ctPackage = factory.Package().getRootPackage();
        // A filter to get all methods whose names are same as target.
        List<CtMethod> list = ctPackage.filterChildren(new AbstractFilter<CtMethod>() {
            @Override
            public boolean matches(CtMethod method) {
                return method.getSimpleName().equals(target);
            }
        }).list();
        return list;
    }

    @Test
    public void shouldGetMethod1() {
        String target = "method1";
        List<CtMethod> methods = getParticularMethod(target);
        for (CtMethod method : methods) {
            System.out.println(method);
            assertEquals(method.getSimpleName(), target);
        }
    }

    @Test
    public void shouldGetMethod2() {
        String target = "method2";
        List<CtMethod> methods = getParticularMethod(target);
        for (CtMethod method : methods) {
            System.out.println(method);
            assertEquals(method.getSimpleName(), target);
        }
    }

    @Test
    public void shouldGetMethod3() {
        String target = "method3";
        List<CtMethod> methods = getParticularMethod(target);
        for (CtMethod method : methods) {
            System.out.println(method);
            assertEquals(method.getSimpleName(), target);
        }
    }

    @Test
    public void shouldGetMethod4() {
        String target = "method4";
        List<CtMethod> methods = getParticularMethod(target);
        for (CtMethod method : methods) {
            System.out.println(method);
            assertEquals(method.getSimpleName(), target);
        }
    }
}

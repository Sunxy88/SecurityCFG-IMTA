package xisong.model;

import org.junit.Test;
import spoon.reflect.code.CtStatement;
import xisong.SecurityElementMatcher;
import xisong.model.programmaticAC.ProgrammaticACFactory;
import xisong.model.programmaticAC.Role;

import java.util.Map;
import java.util.Set;

public class programmaticACTest {

    @Test
    public void roleTest() {
        Role role = ProgrammaticACFactory.eINSTANCE.createRole();
        role.setName("student_manager");
        System.out.println(role);
    }

    @Test
    public void mapToStructureTest() throws Exception {

    }

}

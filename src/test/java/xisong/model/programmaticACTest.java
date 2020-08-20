package xisong.model;

import org.junit.Before;
import org.junit.Test;
import spoon.reflect.code.CtStatement;
import xisong.SecurityElementMatcher;
import xisong.model.programmaticAC.Execute;
import xisong.model.programmaticAC.Permission;
import xisong.model.programmaticAC.ProgrammaticACFactory;
import xisong.model.programmaticAC.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class programmaticACTest {

    private Map<String, Set<CtStatement>> map;

    @Before
    public void getMap() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/12/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        map = securityElementMatcher.roleStatementMap(targetFolder);
//        System.out.println(map);
    }

    @Test
    public void roleTest() {
        Role role = ProgrammaticACFactory.eINSTANCE.createRole();
        role.setName("student_manager");
        System.out.println(role);
    }

    @Test
    public void mapToStructureTest() {
        List<Role> roles = new ArrayList<>();
        for (Map.Entry<String, Set<CtStatement>> entry : map.entrySet()) {
            Role role = ProgrammaticACFactory.eINSTANCE.createRole();
            role.setName(entry.getKey());
            for (CtStatement statement : entry.getValue()) {
                Execute execute = ProgrammaticACFactory.eINSTANCE.createExecute();
                execute.setExecutedStatement(statement);
                Permission permission = ProgrammaticACFactory.eINSTANCE.createPermission();
                permission.setAction(execute);
                role.getPermissions().add(permission);
            }
            roles.add(role);
        }
        for (Role role : roles) {
            System.out.println(role);
            for (Permission permission : role.getPermissions()) {
                System.out.println(permission);
                System.out.println(permission.getAction());
            }
        }
    }

}

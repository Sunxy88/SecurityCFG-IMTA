package xisong.model;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeResourceImpl;
import org.junit.Before;
import org.junit.Test;
import spoon.reflect.code.CtStatement;
import xisong.SecurityElementMatcher;
import xisong.model.programmaticAC.*;

import java.io.IOException;
import java.lang.Object;
import java.util.*;

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

    @Test
    public void EMFPersistence() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/12/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        ACPolicy policy = securityElementMatcher.getPolicy(targetFolder);

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xml",  new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createFileURI("/Users/xisung/Desktop/StudyHard/IMT/Stage2020ete/Code/SpoonControlFlowIMTA/RBACModel.xml"));
        resource.getContents().add(policy);
        resource.save(Collections.EMPTY_MAP);

    }

    @Test
    public void saveACPolicyTest() throws Exception {
        String matcherFolder = "src/main/java/xisong/SecurityElementMatcher.java";
        String targetFolder = this.getClass().getResource("/shiro-example/12/").toURI().getPath();
        SecurityElementMatcher securityElementMatcher = new SecurityElementMatcher(matcherFolder);
        String path = "./RBACModel.xml";
        securityElementMatcher.saveACPolicy(targetFolder, path);
    }
}

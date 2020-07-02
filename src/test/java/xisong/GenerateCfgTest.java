package xisong;

import org.junit.Test;

public class GenerateCfgTest {
    private String generatorTest(String folder) throws Exception {
        return generatorTest(folder, 7);
    }

    private String generatorTest(String folder, int version) throws Exception {
        return new GenerateCfg(folder, version).toGraphVizText();
    }

    @Test
    public void ifStatementTest() throws Exception {
        String folder = this.getClass().getResource("/control-flow/IfStatement").toURI().getPath();
        System.out.println(generatorTest(folder));
    }

    @Test
    public void forStatementTest() throws Exception {
        String folder = this.getClass().getResource("/control-flow/ForStatement").toURI().getPath();
        System.out.println(generatorTest(folder));
    }

    @Test
    public void breakStatementTest() throws Exception {
            String folder = this.getClass().getResource("/control-flow/BreakStatement").toURI().getPath();
            System.out.println(generatorTest(folder));
    }
}

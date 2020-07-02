package xisong;

import fr.inria.SpoonMetaFactory;
import fr.inria.controlflow.ControlFlowBuilder;
import fr.inria.controlflow.ControlFlowGraph;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.processing.Processor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

public class GenerateCfg {
    private String folder;
    private ControlFlowBuilder builder;
    private Factory factory;
    private ProcessingManager pm;
    private Processor<CtMethod> processor;

    private class TraversalProcessor extends AbstractProcessor<CtMethod> {
        @Override
        public void process(CtMethod element) {
            builder.build(element);
        }
    }

    public GenerateCfg(String folder) throws Exception {
        this(folder, 11);
    }


    public GenerateCfg(String folder, int version) throws Exception {
        this.folder = folder;
        this.builder = new ControlFlowBuilder();
        this.factory = new SpoonMetaFactory().buildNewFactory(this.folder, version);
        this.pm = new QueueProcessingManager(factory);
        this.processor = new TraversalProcessor();
        this.pm.addProcessor(this.processor);
    }

    /*
    * No simplify by default
    * */
    public ControlFlowGraph getCFG() {
        return getCFG(true);
    }

    public ControlFlowGraph getCFG(boolean simplify) {
        pm.process(factory.getModel().getAllPackages());
        ControlFlowGraph graph = builder.getResult();
        if (simplify) graph.simplifyConvergenceNodes();
        return graph;
    }

    public String toGraphVizText() {
        return toGraphVizText(false);
    }

    public String toGraphVizText(boolean simplify) {
        return getCFG(simplify).toGraphVisText();
    }

    public ControlFlowBuilder getBuilder() {
        return builder;
    }


    public Factory getFactory() {
        return factory;
    }
}

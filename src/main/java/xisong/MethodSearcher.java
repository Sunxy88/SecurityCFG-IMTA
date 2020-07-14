package xisong;

import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.AbstractFilter;

import java.util.List;

public class MethodSearcher {
    private SpoonAPI spoon;
    private String folder;
    private CtModel model;

    private class NameFilter extends AbstractFilter<CtMethod> {
        private String target;

        public NameFilter(String target) {
            this.target = target;
        }

        @Override
        public boolean matches(CtMethod element) {
            return element.getSimpleName().equals(target);
        }
    }

    public MethodSearcher(String folder) {
        this.spoon = new Launcher();
        this.folder = folder;
        spoon.addInputResource(this.folder);
        spoon.buildModel();
        this.model = spoon.getModel();
    }

    public List<CtMethod> getMethodByName(String methodName) {
        return model.getElements(new NameFilter(methodName));
    }
}

package Algorithm;

import java.util.Collection;

public class ForTest {

    public void forTest(Collection<?> col) {
        if (col.size() > 10)
            throw new IndexOutOfBoundsException();
    }
}

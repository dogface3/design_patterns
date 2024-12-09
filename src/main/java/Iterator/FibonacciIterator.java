package Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {

    private int current = 1;
    private int previous = 0;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int nextValue = previous + current;
        previous = current;
        current = nextValue;
        return previous;
    }

}

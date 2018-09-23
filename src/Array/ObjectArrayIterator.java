package Array;

import java.util.Iterator;

public class ObjectArrayIterator implements Iterator {

    private Object[] arr;
    private int size;
    private int currIndex = 0;

    ObjectArrayIterator(Object[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currIndex < size;
    }

    @Override
    public Object next() {
        Object res = arr[currIndex];
        currIndex++;
        return res;
    }
}
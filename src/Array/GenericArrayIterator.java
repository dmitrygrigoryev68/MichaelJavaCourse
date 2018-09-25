package Array;

import java.util.Iterator;

public class GenericArrayIterator<T> implements Iterator {

    private T[] arr;
    private int size;
    private int currIndex = 0;

    GenericArrayIterator(T[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currIndex < size;
    }

    @Override
    public T next() {
        T res = arr[currIndex];
        currIndex++;
        return res;
    }
}

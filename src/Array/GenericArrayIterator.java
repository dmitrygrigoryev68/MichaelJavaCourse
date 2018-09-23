package Array;

import java.util.Iterator;
import java.util.List;

public class GenericArrayIterator<T> implements Iterator {

    private List<T> arr;
    private int size;
    private int currIndex = 0;

    GenericArrayIterator(List<T> arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currIndex < size;
    }

    @Override
    public T next() {
        T res = arr.get(currIndex);
        currIndex++;
        return res;
    }
}

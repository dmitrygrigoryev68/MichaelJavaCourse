package Array;

import java.util.*;

public class GenericArray<T> implements Iterable {

    List<T> elementsArr = new ArrayList<>();
    // private int size;

    public void addTest(T element) {
        elementsArr.add(element);
    }

    public boolean addAllTest(int index, List<T> arrToAdd) {
        elementsArr.addAll(index, arrToAdd);
        return true;
    }

    public boolean addAtPositionTest(int index, T element) {
        elementsArr.add(index, element);
        return true;
    }

    public boolean removeByIndexTest(int index) {
        if (index < 0 || index >= elementsArr.size()) {
            return false;
        }
        elementsArr.remove(index);
        return true;
    }

    public boolean removeTest(T element) {
        elementsArr.remove(element);
        return true;
    }

    public boolean removeRangeTest(int fromIndex, int toIndex) {
        if (toIndex <= 0 || fromIndex <= 0) {
            return false;
        }
        if (toIndex >= elementsArr.size()) {
            toIndex = elementsArr.size() - 1;
        }
        if (fromIndex >= elementsArr.size()) {
            fromIndex = elementsArr.size() - 1;
        }

        for (int index = toIndex; index >= fromIndex; index--) {
            elementsArr.remove(elementsArr.get(index));
        }
        return true;
    }
    public void print() {
        for (int i = 0; i < elementsArr.size(); i++) {
            System.out.println(elementsArr.get(i));
        }
        System.out.println("\n");
    }

    @Override
    public Iterator iterator() {
        return new GenericArrayIterator(elementsArr, elementsArr.size());
    }

}


////////////////////////// Handmade functions/////////////////////////////////////
/*
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (elementsArr.get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementsArr.get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        if (rangeCheck(index)) {
            return elementsArr.get(index);
        }
        return null;
    }

    public T set(int index, T element) {
        T oldValue = null;
        if (rangeCheck(index)) {
            oldValue = elementsArr.get(index);
            elementsArr.set(index, element);
        }
        return oldValue;
    }

    public boolean add(T element) {
        ensureCapacity(size + 1);
        elementsArr.set(size, element);
        size++;
        return true;
    }


    public boolean addAtPosition(int index, T element) {
        if (index >= size) {
            return false;
        }
        ensureCapacity(size + 1);
        copyArray(elementsArr, index, elementsArr, index + 1, size - index);
        elementsArr.set(index, element);
        size++;
        return true;
    }

    public boolean addAll(List<T> arrToAdd) {
        ensureCapacity(size + arrToAdd.size());
        copyArray(arrToAdd, 0, elementsArr, size, arrToAdd.size());
        size += arrToAdd.size();
        return true;
    }

    public boolean addAll(int index, List<T> arrToAdd) {
        if (index > size || index < 0) {
            return false;
        }
        ensureCapacity(size + arrToAdd.size());
//        how much the array needs to grow
        int step = size - index;
//        if step is bigger than 0, than index is between 0 and size-1, so we need to copy existing array
        if (step > 0) {
            copyArray(elementsArr, index, elementsArr, index + arrToAdd.size(), step);
            copyArray(arrToAdd, 0, elementsArr, index, elementsArr.size());
            size += arrToAdd.size();
        } else {
            addAll(arrToAdd);
        }
        return true;
    }

    public boolean remove(T element) {
        int foundIndex = indexOf(element);
        if (foundIndex == -1) {
            return false;
        }
        removeByIndex(foundIndex);
        return true;
    }

    public T removeByIndex(int index) {
        if (!rangeCheck(index)) {
            return null;
        }
        T oldValue = elementsArr.get(index);
        copyArray(elementsArr, index + 1, elementsArr, index, size - index);
        size--;
        return oldValue;
    }

    public boolean removeRange(int fromIndex, int toIndex) {
        int step = size - toIndex;
        copyArray(elementsArr, toIndex, elementsArr, fromIndex, step);
        if (fromIndex < 0 || fromIndex >= size || toIndex > size || toIndex < fromIndex) {
            return false;
        }
        size -= (toIndex - fromIndex);
        return true;
    }


    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elementsArr.size()) resizeCapacity(minCapacity);
    }

    private void resizeCapacity(int minCapacity) {
        int oldCapacity = elementsArr.size();
        int newCapacity = oldCapacity + (oldCapacity * 2);
        if (newCapacity < minCapacity) newCapacity = minCapacity;
        elementsArr = copyArray(elementsArr, newCapacity);
    }

    private List<T> copyArray(List<T> elementsArr, int newSize) {
        List<T> newArr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            newArr.set(i, elementsArr.get(i));
        }
        return newArr;
    }

    private void copyArray(List<T> src, int srcPos, List<T> dest, int destPos, int length) {
        if (src.equals(dest)) {
            src = copyArray(src, src.size());
        }
        while (length + 1 >= 0 && destPos < dest.size() && srcPos < src.size()) {
            dest.set(destPos, src.get(srcPos));
            destPos++;
            srcPos++;
            length--;
        }
    }

    private boolean rangeCheck(int index) {
        if (index >= size && index < 0) {
            return false;
        }
        return true;
    }

    */
/*package Array;

import Array.ObjectArrayIterator;

import java.util.Arrays;
import java.util.Iterator;

public class ObjectArray implements Iterable {

    private Object[] elementsArr;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    ObjectArray() {
        elementsArr = new Object[DEFAULT_CAPACITY];
    }

    ObjectArray(int capacity) {
        elementsArr = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (elementsArr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementsArr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int index) {
        if (rangeCheck(index)) {
            return elementsArr[index];
        }
        return -1;
    }

    public Object set(int index, Object element) {
        Object oldValue = null;
        if (rangeCheck(index)) {
            oldValue = elementsArr[index];
            elementsArr[index] = element;
        }
        return oldValue;
    }

    public boolean add(Object element) {
        ensureCapacity(size + 1);
        elementsArr[size] = element;
        size++;
        return true;
    }

    public boolean addAtPosition(int index, Object element) {
        if (index >= size) {
            return false;
        }
        ensureCapacity(size + 1);
        copyArray(elementsArr, index, elementsArr, index + 1, size - index);
        elementsArr[index] = element;
        size++;
        return true;
    }

    public boolean addAll(Object[] arrToAdd) {
        ensureCapacity(size + arrToAdd.length);
        copyArray(arrToAdd, 0, elementsArr, size, arrToAdd.length);
        size += arrToAdd.length;
        return true;
    }

    public boolean addAll(int index, Object[] arrToAdd) {
        if (index > size || index < 0) {
            return false;
        }
        ensureCapacity(size + arrToAdd.length);
//        how much the array needs to grow
        int step = size - index;
//        if step is bigger than 0, than index is between 0 and size-1, so we need to copy existing array
        if (step > 0) {
            copyArray(elementsArr, index, elementsArr, index + arrToAdd.length, step);
            copyArray(arrToAdd, 0, elementsArr, index, elementsArr.length);
            size += arrToAdd.length;
        } else {
            addAll(arrToAdd);
        }
        return true;
    }

    public boolean remove(Object element) {
        int foundIndex = indexOf(element);
        if (foundIndex == -1) {
            return false;
        }
        removeByIndex(foundIndex);
        return true;
    }

    public Object removeByIndex(int index) {
        if (!rangeCheck(index)) {
            return null;
        }
        Object oldValue = elementsArr[index];
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
        if (minCapacity - elementsArr.length > 0) resizeCapacity(minCapacity);
    }

    private void resizeCapacity(int minCapacity) {
        int oldCapacity = elementsArr.length;
        int newCapacity = oldCapacity + (oldCapacity * 2);
        if (newCapacity - minCapacity < 0) newCapacity = minCapacity;
        elementsArr = copyArray(elementsArr, newCapacity);
    }

    private Object[] copyArray(Object[] elementsArr, int newSize) {
        Object[] newArr = new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = elementsArr[i];
        }
        return newArr;
    }

    private void copyArray(Object[] src, int srcPos, Object[] dest, int destPos, int length) {
        if (Arrays.equals(src, dest)) {
            src = copyArray(src, src.length);
        }
        while (length + 1 >= 0 && destPos < dest.length && srcPos < src.length) {
            dest[destPos] = src[srcPos];
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

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elementsArr[i]);
        }
        System.out.println("\n");
    }

    @Override
    public Iterator iterator() {
        return new ObjectArrayIterator(elementsArr, size);
    }
}*/
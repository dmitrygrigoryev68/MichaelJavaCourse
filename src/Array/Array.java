package Array;

import java.util.Iterator;

public class Array implements Iterable {

    private int[] arr;
    private int size;
    private static final int DEFAULT_CAPACITY = 30;

    Array() {
        arr = new int[DEFAULT_CAPACITY];
    }

    Array(int capacity) {
        arr = new int[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(int number) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int number) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index) {
        if (index < size) {
            return arr[index];
        }
        return -1;
    }

    public int set(int index, int number) {
        int oldValue = -1;
        if (index < size) {
            oldValue = arr[index];
            arr[index] = number;
        }
        return oldValue;
    }

    public boolean add(int number) {
        ensureCapacity();
        arr[size] = number;
        size++;
        return true;
    }

    public boolean addAtPosition(int index, int number) {
        if (index >= size) {
            return false;
        }
        ensureCapacity();
        int[] oldArr = copyArray(size);
        size++;
        arr[index] = number;
        for (int i = index + 1; i < size; i++) {
            arr[i] = oldArr[i - 1];
        }
        return true;
    }

    public int remove(int number) {
        int foundIndex = indexOf(number);
        if (foundIndex == -1) {
            return -1;
        }
        int[] oldArr = copyArray(size);
        int oldValue = arr[foundIndex];
        size--;
        for (int i = foundIndex; i < size; i++) {
            arr[i] = oldArr[i + 1];
        }
        return oldValue;
    }

    private void ensureCapacity() {
        if (size == arr.length) {
            int newSize = arr.length * 2;
            arr = copyArray(newSize);
        }
    }

    private int[] copyArray(int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public boolean addAll(int[] arrToAdd) {
        int newSize = size + arrToAdd.length;
        arr = copyArray(newSize);
        for (int i = 0; i < arrToAdd.length; i++) {
            arr[newSize - arrToAdd.length + i] = arrToAdd[i];
        }
        size = newSize;
        return true;
    }


    public boolean addAll(int index, int[] arrToAdd) {
        if (index > size) {
            return false;
        }
        if (index == size) {
            addAll(arrToAdd);
            return true;
        }

        int newSize = size + arrToAdd.length;
        int[] newArr = copyArray(newSize);
        for (int i = index; i < size; i++) {
            newArr[i + arrToAdd.length] = arr[i];
        }
        for (int i = 0; i < arrToAdd.length; i++) {
            newArr[i + index] = arrToAdd[i];
        }
        arr = copyArray(newSize);
        for (int i = 0; i < newSize; i++) {
            arr[i] = newArr[i];
        }
        size = newSize;
        return true;
    }

    public boolean removeRange(int fromIndex, int toIndex) {
        if (toIndex >= size) {
            return false;
        }
        int range = toIndex - fromIndex + 1;
        int newSize = size - range;
        int[] newArr = new int[newSize];
        for (int i = 0; i < fromIndex; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < size - range - fromIndex; i++) {
            newArr[i + fromIndex] = arr[i + 1 + toIndex];
        }
        size = newSize;
        for (int i = 0; i < size; i++) {
            arr[i] = newArr[i];
        }
        return true;
    }

    public int removeByIndex(int index) {
        int[] oldArr = copyArray(size);
        int oldValue = arr[index];
        size--;
        for (int i = index; i < size; i++) {
            arr[i] = oldArr[i + 1];
        }
        return oldValue;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n");
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(arr, size);
    }
}

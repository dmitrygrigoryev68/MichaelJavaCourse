package Sorting;

import Array.ArrayUtils;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr = ArrayUtils.fillArrayRandomly(arr);

        selectionSort(arr);

        ArrayUtils.print(arr);
    }

    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

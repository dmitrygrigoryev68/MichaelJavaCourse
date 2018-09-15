package Sorting;

import Array.ArrayUtils;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr = ArrayUtils.fillArrayRandomly(arr);

        bubbleSort(arr);

        ArrayUtils.print(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

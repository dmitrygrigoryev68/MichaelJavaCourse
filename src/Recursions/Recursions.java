package Recursions;

public class Recursions {
    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Fabonacci: " + fabonacciNumber(6));

        int[] arr = new int [10];

        arr = fillArraWithFabonacciNumbers(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static int factorial(int num) {
        if (num > 1) {
            num = factorial(num - 1) * num;
        }
        return num;
    }

    static int fabonacciNumber(int num) {
        if (num > 1) {
            num = fabonacciNumber(num - 1) + fabonacciNumber(num - 2);
        }
        return num;
    }

    static int[] fillArraWithFabonacciNumbers(int[] arr, int index) {
        if(index < arr.length){
            arr[index] = fabonacciNumber(index);
            fillArraWithFabonacciNumbers(arr, ++index);
        }
        return arr;
    }
}

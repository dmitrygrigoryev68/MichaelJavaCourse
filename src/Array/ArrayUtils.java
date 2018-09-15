package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {
    public static void print (int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static int[] fillArrayRandomly (int[] arr){
        for(int i =0; i<arr.length; i++){
            arr[i] = new Random().nextInt(30);
        }
        return arr;
    }
}

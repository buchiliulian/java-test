package practice;

import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {

        ArrayMinMax arrayMinMax = new ArrayMinMax();
        int[] arr = {2, 8, 9, -3, 7, -5, 6, 1};
        Arrays.sort(arr);
        System.out.println("min = " + arr[0]);
        System.out.println("max = " + arr[arr.length - 1]);

        arrayMinMax.Min(arr);
        arrayMinMax.Max(arr);
    }

    public void Max(int[] arr) {
        int max = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }

    public void Min(int[] arr) {
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
    }
}

package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//1. Print elements of an array: Use a standard for loop, enhanced for loop, or Arrays.toString()
public class P01_PrintElementsOfArray {

    int[] arr = { 2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4 };

    public static void main(String[] args) {

        P01_PrintElementsOfArray obj = new P01_PrintElementsOfArray();
        // obj.StandardForLoop();
        // obj.enhancedForLoop();
        obj.ArraysToString();
    }

    public void StandardForLoop() {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void enhancedForLoop() {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void ArraysToString() {

        String str = Arrays.toString(arr);
        System.out.println(str);

    }
}

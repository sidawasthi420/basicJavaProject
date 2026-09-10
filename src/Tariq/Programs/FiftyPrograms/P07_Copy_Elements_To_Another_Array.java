package Tariq.Programs.FiftyPrograms;

// 7. Copy elements to another array: Initialize a new array of identical size and assign index by index.

public class P07_Copy_Elements_To_Another_Array {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            arr1[i] = arr[i];
        }

        for (int i : arr1) {
            System.out.println(i);
        }
    }

}

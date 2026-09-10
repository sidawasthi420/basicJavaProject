package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//30. Remove duplicates from a sorted array: Track unique entries using an independent index pointer without utilizing extra memory collections.

public class P30_Remove_Duplicates_From_Sorted_Array {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[uniqueIndex]) {

                uniqueIndex++;

                arr[uniqueIndex] = arr[i];
            }
        }

        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.println(arr[i]);
        }
    }
}

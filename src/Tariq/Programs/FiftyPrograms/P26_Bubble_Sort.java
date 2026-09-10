package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//26. Bubble Sort implementation: Use nested loops to repeatedly swap adjacent items that are out of order.

public class P26_Bubble_Sort {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 8, 1, 3 };

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}

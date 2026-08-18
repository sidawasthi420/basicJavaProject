package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//42. Dutch National Flag Problem: Sort an array containing only 0s, 1s, and 2s using low, mid, and high references.

public class P42_Dutch_National_Flag {

    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0 };

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            else if (arr[mid] == 1) {

                mid++;
            }

            else {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
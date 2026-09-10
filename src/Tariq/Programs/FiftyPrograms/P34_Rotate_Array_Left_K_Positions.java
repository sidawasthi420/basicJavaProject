package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//34. Rotate an array to the left by K positions: Rotate elements leftwards by using segment reversal or an auxiliary space allocation.

public class P34_Rotate_Array_Left_K_Positions {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        k = k % arr.length;

        int left = 0;
        int right = k - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        left = k;
        right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        left = 0;
        right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}

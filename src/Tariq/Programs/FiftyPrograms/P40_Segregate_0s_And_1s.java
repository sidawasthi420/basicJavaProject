
package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//40. Segregate 0s and 1s: Initialize boundary pointers at the start and end indices, swapping values until they meet.

class P40_Segregate_0s_And_1s {

    public static void main(String[] args) {

        int[] arr = { 1, 0, 1, 0, 1, 0, 0 };

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right) {

                left++;
            }

            while (arr[right] == 1 && left < right) {

                right--;
            }

            if (left < right) {

                int temp = arr[left];

                arr[left] = arr[right];

                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
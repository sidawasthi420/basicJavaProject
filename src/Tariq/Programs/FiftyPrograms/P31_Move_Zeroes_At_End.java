package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//31. Move all zeroes to the end: Track the next non-zero position and shift numbers forward in a single pass.

public class P31_Move_Zeroes_At_End {

    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 0, 0, 3, 4, 4, 5 };

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                arr[index] = arr[i];
                index++;

            }
        }

        while (index < arr.length) {

            arr[index] = 0;
            index++;
        }
        

        System.out.println(Arrays.toString(arr));
    }
}

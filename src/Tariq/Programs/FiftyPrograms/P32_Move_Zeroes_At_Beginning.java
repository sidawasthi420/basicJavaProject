package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//32. Move all zeroes to the beginning: Track the index from the tail end and assign values backwards.

public class P32_Move_Zeroes_At_Beginning {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 0, 3, 4, 4, 5};

        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {

                arr[index] = arr[i];

                index--;
            }
        }

        while (index >= 0) {

            arr[index] = 0;

            index--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
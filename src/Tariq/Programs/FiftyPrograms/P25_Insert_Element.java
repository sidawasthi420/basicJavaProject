package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//25. Insert an element at a given index: Create an expanded array, copy segments before the index, insert the target, and copy the remainder.

public class P25_Insert_Element {

    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 3, 7, 6 };

        int insert = 9;
        int index = 3;

        int[] arr1 = new int[arr.length+1];

        for(int i=0; i<index; i++){

            arr1[i] = arr[i];


        }

        arr1[index] = insert;

        for(int i=index; i<arr.length; i++){

            arr1[i+1] = arr[i];
        }

        System.out.println(Arrays.toString(arr1));


    }
    

}

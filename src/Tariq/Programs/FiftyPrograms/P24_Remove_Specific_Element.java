package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//24. Remove a specific element: Generate a new array excluding the targeted value index.

public class P24_Remove_Specific_Element {

    public static void main(String[] args) {
        
        int[] arr = { 2, 5, 8, 3, 7, 6 };

        int remove = 8;

        int[] arr1 = new int[arr.length-1];

        int j=0;

        for(int i=0; i<arr.length; i++){

            if(arr[i ]!= remove){

                arr1[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}

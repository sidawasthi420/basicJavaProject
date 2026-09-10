package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//27. Selection Sort implementation: Repeatedly isolate the minimum element from the unsorted segment and place it first.

public class P27_Selection_Sort {

    public static void main(String[] args) {
        
                int[] arr = { 5, 2, 8, 1, 3 };

                for(int i=0; i<arr.length-1; i++){

                    int min = i;

                    for(int j=i+1; j<arr.length; j++){

                        if(arr[j]<arr[min]){

                            min=j;
                        }
                    }

                    int temp = arr[i];

                    arr[i] = arr[min];
                    arr[min] = temp;
                }
                System.out.println(Arrays.toString(arr));
    }
}

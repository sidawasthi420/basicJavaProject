package Tariq.Programs.FiftyPrograms;

import java.util.ArrayList;
import java.util.Arrays;

//21. Convert an Array to an ArrayList: Employ the native Arrays.asList(array) method.

public class P21_Array_To_ArrayList {

    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 3, 7, 6 };

        Integer[] arr1 = new Integer[arr.length];

        for(int i=0; i<arr.length; i++){

            arr1[i] = arr[i] ;
        }

        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(arr1));

        System.out.println(arrayList);

    }
}

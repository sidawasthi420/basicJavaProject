package yashwin.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class A21_ArrayToArrayList {
    public static void main(String[] args) {

        //Creating an int array
        int[] arr = {2, 3, 4, 5, 6, 9, 5, 8, 7, 6, 5, 4};

        //Creating an Integer array with the same length of int array
        Integer[] arr1 = new Integer[arr.length];

        //Converting each element of int array into Integer array
        for(int i=0; i<arr1.length; i++){
            arr1[i] = arr[i]; 
        }

        //Converting array into ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr1));

        //Creating an Integer array
        Integer[] arr2 = {2, 3, 4, 5, 6, 9, 5, 8, 7, 6, 5, 4};

        //Converting array into ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr2));

        //Displaying ArrayList
        System.out.println("ArrayList : " + list);
        System.out.println("ArrayList : " + list1);
    }
}
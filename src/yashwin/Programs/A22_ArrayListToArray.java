package yashwin.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A22_ArrayListToArray {
    public static void main(String[] args) {

        //Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        //Converting ArrayList to Integer array
        // Integer[] arr = list.toArray(new Integer[0]);
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);

        //Displaying converted array
        System.out.println("Array : " + Arrays.toString(arr));
    }
}
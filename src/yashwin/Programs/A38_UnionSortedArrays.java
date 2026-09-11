package yashwin.Programs;

import java.util.ArrayList;

public class A38_UnionSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };

        int[] arr2 = { 3, 4, 5, 6 };

        // Create ArrayList to store unique elements
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements of first array
        for (int i = 0; i < arr1.length; i++) {

            if (!list.contains(arr1[i])) {

                list.add(arr1[i]);
            }
        }

        // Add elements of second array
        for (int i = 0; i < arr2.length; i++) {

            if (!list.contains(arr2[i])) {

                list.add(arr2[i]);
            }
        }

        // Print union
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");
        }
    }
}
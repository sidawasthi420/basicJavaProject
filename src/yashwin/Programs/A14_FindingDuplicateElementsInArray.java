package yashwin.Programs;

import java.util.LinkedHashSet;

public class A14_FindingDuplicateElementsInArray {
    public static void main(String[] args) {

        //Creating array with duplicate elements
        int[] arr = {2, 3, 4, 5, 6, 9, 5, 8, 7, 6, 5, 4};

        LinkedHashSet<Integer> duplicateValues = new LinkedHashSet<Integer>();

        //Using for loop to iterate and compare
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    
                    duplicateValues.add(arr[i]);
                    
                }

            }
        }

        System.out.println("Duplicate Values of array : " + duplicateValues);

    }

}
package Tariq.Programs.FiftyPrograms;

import java.util.HashSet;

//20. Find common elements between two arrays: Loop through the first array and verify existence in the second using a HashSet.

public class P20_Common_Elements_Between_Two_Arrays {

    public static void main(String[] args) {

        int[] arr1 = { 2, 5, 8, 3, 7, 6 };
        int[] arr2 = { 7, 1, 6, 4, 5, 9 };


        HashSet<Integer> hashSet = new HashSet<>();

        for(int i: arr1){
            hashSet.add(i);
        }

        for(int i: arr2){
            if(hashSet.contains(i)){
                System.out.println( "Common element " + i);
            }
        }
    }
}

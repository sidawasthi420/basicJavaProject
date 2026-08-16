package Tariq.Programs.FiftyPrograms;

import java.util.HashSet;

//15. Find duplicate elements (Optimized): Add elements to a HashSet and catch duplicates when .add() returns false.

public class P15_Duplicate_Elements {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 5, 4, 6, 7, 6 };

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {

            if(!hashSet.add(i)){
                System.out.println(i + " is duplicate");
            }

        }

    }
}



package Tariq.Programs.FiftyPrograms;

import java.util.HashSet;

//36. Find pairs whose sum equals a given target: Use a HashSet or a two-pointer approach on a sorted array.

public class P36_Find_Pairs_With_Target_Sum {

    public static void main(String[] args) {

        int[] arr = { 2, 7, 4, 3, 5, 1 };

        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {

            int required = target - i;

            if (set.contains(required)) {

                System.out.println("pair is: " + i + "," + required);
            }

            set.add(i);
        }
    }
}

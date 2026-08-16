package Tariq.Programs.FiftyPrograms;

import java.util.HashSet;

//16. Check if all elements are unique: Use a HashSet to confirm that the set size equals the array length.

public class P16_Unique_Elements {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 7, 6, 6 };

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            hashSet.add(i);
        }

        int arrSize = arr.length;

        int hashSetSize = hashSet.size();

        if (arrSize == hashSetSize) {
            System.out.println("all elements are unique");
        } else {
            System.out.println("all elements are not unique");

        }

    }
}

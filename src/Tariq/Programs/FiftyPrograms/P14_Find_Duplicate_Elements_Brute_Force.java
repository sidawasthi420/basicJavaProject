package Tariq.Programs.FiftyPrograms;

//14. Find duplicate elements (Brute Force): Compare every element against all others using a nested loop structure.

public class P14_Find_Duplicate_Elements_Brute_Force {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 5, 4, 6, 7, 6 };

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " found duplicate");
                }

            }
        }
    }

}

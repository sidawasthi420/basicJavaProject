package Tariq.Programs.FiftyPrograms;

//5. Find the smallest element: Initialize a min variable with arr[0] and update it during traversal.

public class P05_SmallestElement {

    public static void main(String[] args) {

        int[] arr = { 8, 5, 2, 30, 12, 4, 2 };

        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}

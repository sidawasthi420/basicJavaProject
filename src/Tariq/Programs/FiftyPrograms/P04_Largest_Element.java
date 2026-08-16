package Tariq.Programs.FiftyPrograms;

//4. Find the largest element: Initialize a max variable with arr[0] and update it as you loop.

public class P04_Largest_Element {

    public static void main(String[] args) {

        int[] arr = { 8, 5, 2, 30, 12, 4, 2 };

        int max = arr[0];

        for (int i : arr) {

            if (i > max) {
                max = i;
            }

        }
        System.out.println(max);

    }
}

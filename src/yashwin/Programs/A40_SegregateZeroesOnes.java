package yashwin.Programs;

public class A40_SegregateZeroesOnes {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 1, 1, 0, 1 };

        // Index where next zero should be placed
        int j = 0;

        // Check all elements
        for (int i = 0; i < arr.length; i++) {

            // If current element is zero
            if (arr[i] == 0) {

                // Swap current element with element at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move j to next position
                j++;
            }
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
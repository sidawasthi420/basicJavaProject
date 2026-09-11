package yashwin.Programs;

public class A26_BubbleSort {

    public static void main(String[] args) {

        // Original array
        int[] arr = { 5, 3, 8, 1, 2 };

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Check if elements are in wrong order
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
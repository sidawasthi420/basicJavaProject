package yashwin.Programs;

public class A28_InsertionSort {

    public static void main(String[] args) {

        // Original array
        int[] arr = { 5, 3, 8, 1, 2 };

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {

            // Store current element
            int current = arr[i];

            // Start comparing with previous element
            int j = i - 1;

            // Move larger elements one position ahead
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;
            }

            // Insert current element at correct position
            arr[j + 1] = current;
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
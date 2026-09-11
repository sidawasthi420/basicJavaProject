package yashwin.Programs;

public class A27_SelectionSort {

    public static void main(String[] args) {

        // Original array
        int[] arr = { 64, 25, 12, 22, 11 };

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume current element is smallest
            int minIndex = i;

            // Find smallest element in remaining array
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap current element with smallest element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
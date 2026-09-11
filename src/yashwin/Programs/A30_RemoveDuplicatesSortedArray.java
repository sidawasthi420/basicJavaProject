package yashwin.Programs;

public class A30_RemoveDuplicatesSortedArray {

    public static void main(String[] args) {

        int[] arr = { 10, 10, 20, 20, 30, 40, 40 };

        // Create a new array with the same size
        int[] newArr = new int[arr.length];

        // Index for new array
        int j = 0;

        // Store first element
        newArr[j] = arr[0];
        j++;

        // Check remaining elements
        for (int i = 1; i < arr.length; i++) {

            // If current element is different from previous element
            if (arr[i] != arr[i - 1]) {

                // Store unique element
                newArr[j] = arr[i];
                j++;
            }
        }

        // Print unique elements
        for (int i = 0; i < j; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
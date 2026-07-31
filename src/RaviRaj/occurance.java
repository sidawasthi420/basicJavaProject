package RaviRaj;

public class occurance {   // Remove All Occurrences of an Element in an Array
    public static void main(String st[]){

    int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int element = 2;
        int n = arr.length;

        // Remove all occurrences of the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                // Shift elements to the left
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--; // Check the same index again
            }
        }

        // Display the updated array
        System.out.print("Array after removing all occurrences: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
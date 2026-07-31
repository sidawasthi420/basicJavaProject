package RaviRaj;

import java.util.Arrays;

public class Sort_Array {  //Sort an Array in Ascending and Descending Order using Built-in method

    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        // Sort in ascending order
        Arrays.sort(arr);

        System.out.print("Ascending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sort in descending order
        System.out.print("\nDescending Order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
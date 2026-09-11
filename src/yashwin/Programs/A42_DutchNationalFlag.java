package yashwin.Programs;

public class A42_DutchNationalFlag {

    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0 };

        // Starting index for zeroes
        int low = 0;

        // Current element
        int mid = 0;

        // Starting index for twos from end
        int high = arr.length - 1;

        // Continue until mid crosses high
        while (mid <= high) {

            // If current element is 0
            if (arr[mid] == 0) {

                // Swap with low
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            // If current element is 1
            } else if (arr[mid] == 1) {

                // 1 is already in the middle
                mid++;

            // If current element is 2
            } else {

                // Swap with high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
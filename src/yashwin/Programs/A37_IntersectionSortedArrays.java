package yashwin.Programs;

public class A37_IntersectionSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };

        int[] arr2 = { 2, 4, 6, 8 };

        // Compare elements of both arrays
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                // If elements are same
                if (arr1[i] == arr2[j]) {

                    System.out.print(arr1[i] + " ");

                    // Move to next element of first array
                    break;
                }
            }
        }
    }
}
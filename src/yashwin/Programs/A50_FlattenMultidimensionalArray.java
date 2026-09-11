package yashwin.Programs;

public class A50_FlattenMultidimensionalArray {

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Find total number of elements
        int size = 0;

        for (int i = 0; i < arr.length; i++) {

            size = size + arr[i].length;
        }

        // Create one-dimensional array
        int[] newArr = new int[size];

        // Index for new array
        int k = 0;

        // Read every element from 2D array
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                // Store element in new array
                newArr[k] = arr[i][j];

                // Move to next position
                k++;
            }
        }

        // Print flattened array
        for (int i = 0; i < newArr.length; i++) {

            System.out.print(newArr[i] + " ");
        }
    }
}
package yashwin.Programs;

public class A46_MatrixMultiplication {

    public static void main(String[] args) {

        int[][] arr1 = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] arr2 = {
                { 5, 6 },
                { 7, 8 }
        };

        // Create result matrix
        int[][] result = new int[arr1.length][arr2[0].length];

        // Loop through rows of first matrix
        for (int i = 0; i < arr1.length; i++) {

            // Loop through columns of second matrix
            for (int j = 0; j < arr2[0].length; j++) {

                // Multiply and add corresponding elements
                for (int k = 0; k < arr2.length; k++) {

                    result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print result matrix
        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[i].length; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}
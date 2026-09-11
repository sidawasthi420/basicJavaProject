package yashwin.Programs;

public class A44_MatrixAddSubtract {

    public static void main(String[] args) {

        int[][] arr1 = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] arr2 = {
                { 5, 6 },
                { 7, 8 }
        };

        // Addition
        System.out.println("Addition:");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                // Add corresponding elements
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }

            System.out.println();
        }

        // Subtraction
        System.out.println("Subtraction:");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                // Subtract corresponding elements
                System.out.print((arr1[i][j] - arr2[i][j]) + " ");
            }

            System.out.println();
        }
    }
}
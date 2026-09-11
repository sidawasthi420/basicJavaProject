package yashwin.Programs;

public class A43_PrintMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Loop through rows
        for (int i = 0; i < arr.length; i++) {

            // Loop through columns
            for (int j = 0; j < arr[i].length; j++) {

                // Print current element
                System.out.print(arr[i][j] + " ");
            }

            // Move to next row
            System.out.println();
        }
    }
}
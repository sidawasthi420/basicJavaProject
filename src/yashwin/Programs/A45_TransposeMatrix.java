package yashwin.Programs;

public class A45_TransposeMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // Loop through columns
        for (int i = 0; i < arr[0].length; i++) {

            // Loop through rows
            for (int j = 0; j < arr.length; j++) {

                // Print column as row
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
        }
    }
}
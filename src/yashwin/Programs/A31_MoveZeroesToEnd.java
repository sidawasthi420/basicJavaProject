package yashwin.Programs;

public class A31_MoveZeroesToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        // Create a new array
        int[] newArr = new int[arr.length];

        // Index for new array
        int j = 0;

        // First store all non-zero elements
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                newArr[j] = arr[i];
                j++;
            }
        }

        // Remaining positions will automatically contain 0

        // Print new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
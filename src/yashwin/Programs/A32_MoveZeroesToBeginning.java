package yashwin.Programs;

public class A32_MoveZeroesToBeginning {

    public static void main(String[] args) {

        int[] arr = { 1, 0, 3, 0, 12 };

        // Create a new array
        int[] newArr = new int[arr.length];

        // First index of new array
        int j = 0;

        // Store all zeroes first
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                newArr[j] = arr[i];
                j++;
            }
        }

        // Store all non-zero elements after zeroes
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                newArr[j] = arr[i];
                j++;
            }
        }

        // Print new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
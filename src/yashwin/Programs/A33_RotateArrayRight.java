package yashwin.Programs;

public class A33_RotateArrayRight {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int k = 2;

        // Create a new array
        int[] newArr = new int[arr.length];

        // Move each element to its new position
        for (int i = 0; i < arr.length; i++) {

            newArr[(i + k) % arr.length] = arr[i];
        }

        // Print rotated array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
package yashwin.Programs;

public class A34_RotateArrayLeft {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int k = 2;

        // Create a new array
        int[] newArr = new int[arr.length];

        // Move elements to the left
        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[(i + k) % arr.length];
        }

        // Print rotated array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
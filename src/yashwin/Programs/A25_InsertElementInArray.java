package yashwin.Programs;

public class A25_InsertElementInArray {
    public static void main(String[] args) {

        // Original array
        int[] arr = { 10, 20, 30, 40, 50 };

        // Element to insert
        int element = 99;

        // Index where element should be inserted
        int index = 2;

        // Create new array with one extra space
        int[] newArr = new int[arr.length + 1];

        // Copy elements of the old arry with inserted value
        for (int i = 0; i < arr.length; i++) {

            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = element;
                newArr[i + 1] = arr[i];
            } else if (i > index) {
                newArr[i + 1] = arr[i];
            }

        }

        // Print new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
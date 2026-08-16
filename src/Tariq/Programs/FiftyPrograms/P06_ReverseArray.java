package Tariq.Programs.FiftyPrograms;

//6. Reverse an array in place: Swap elements using two pointers (start and end) moving toward the center.

public class P06_ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

}

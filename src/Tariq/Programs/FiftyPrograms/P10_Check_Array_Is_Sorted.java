package Tariq.Programs.FiftyPrograms;

//10. Check if an array is sorted: Loop to verify if arr[i] <= arr[i + 1] holds true for all iterations.

public class P10_Check_Array_Is_Sorted {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

        boolean b = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {

            } else {
                b = false;
            }
        }

        if (b) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");

        }
    }
}

package yashwin.Programs;

public class A35_FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };

        int n = 5;

        // Find sum of all elements in array
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        // Find sum of numbers from 1 to n
        int total = n * (n + 1) / 2;

        // Difference will be the missing number
        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}
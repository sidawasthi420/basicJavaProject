package Tariq.Programs.FiftyPrograms;

//41. Find the sub-array with the maximum sum (Kadane’s Algorithm): Track the maximum sum ending at the current index.

public class P41_Maximum_Subarray_Sum {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int currentSum = arr[0];

        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum sub-array sum: " + maxSum);
    }
}
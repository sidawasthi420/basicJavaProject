package yashwin.Programs;

public class A41_MaxSubarraySum {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Store current subarray sum
        int currentSum = arr[0];

        // Store maximum sum found
        int maxSum = arr[0];

        // Check remaining elements
        for (int i = 1; i < arr.length; i++) {

            // Either start a new subarray or continue current one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        // Print maximum sum
        System.out.println("Maximum sum: " + maxSum);
    }
}
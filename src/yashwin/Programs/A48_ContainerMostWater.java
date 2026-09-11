package yashwin.Programs;

public class A48_ContainerMostWater {

    public static void main(String[] args) {

        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        // Start from both ends
        int start = 0;
        int end = arr.length - 1;

        // Store maximum area
        int maxArea = 0;

        // Continue until both pointers meet
        while (start < end) {

            // Find smaller height
            int height = Math.min(arr[start], arr[end]);

            // Find width between two lines
            int width = end - start;

            // Calculate area
            int area = height * width;

            // Update maximum area
            if (area > maxArea) {

                maxArea = area;
            }

            // Move pointer having smaller height
            if (arr[start] < arr[end]) {

                start++;

            } else {

                end--;
            }
        }

        // Print maximum area
        System.out.println("Maximum area: " + maxArea);
    }
}
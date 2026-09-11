package yashwin.Programs;

public class A36_PairSumTarget {

    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 15 };

        int target = 9;

        // Compare every element with the elements after it
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                // Check if pair sum is equal to target
                if (arr[i] + arr[j] == target) {

                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
package yashwin.Programs;

public class A47_LeadersInArray {

    public static void main(String[] args) {

        int[] arr = { 16, 17, 4, 3, 5, 2 };

        // Check every element
        for (int i = 0; i < arr.length; i++) {

            // Assume current element is a leader
            boolean leader = true;

            // Compare with elements on the right
            for (int j = i + 1; j < arr.length; j++) {

                // If any element on right is greater
                if (arr[i] <= arr[j]) {

                    leader = false;
                    break;
                }
            }

            // Print if it is a leader
            if (leader) {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
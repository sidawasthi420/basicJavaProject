package yashwin.Programs;

public class A39_ArrayPalindrome {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 1 };

        // Start from both ends
        int start = 0;
        int end = arr.length - 1;

        // Assume array is palindrome
        boolean palindrome = true;

        // Compare elements from both ends
        while (start < end) {

            if (arr[start] != arr[end]) {

                palindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Print result
        if (palindrome) {

            System.out.println("Palindrome");

        } else {

            System.out.println("Not Palindrome");
        }
    }
}
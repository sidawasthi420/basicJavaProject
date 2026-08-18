package Tariq.Programs.FiftyPrograms;

import java.util.Arrays;

//39. Check if an array is a Palindrome: Use pointers at opposite ends of the array and move toward the middle.

public class P39_Check_Array_Is_Palindrome {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 1 };

        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (arr[left] != arr[right]) {

                isPalindrome = false;
                break;
            }
            left++;
            right--;

        }

        if (isPalindrome) {

            System.out.println(Arrays.toString(arr) + " - is Palindrome");
        }

        else {
            System.out.println(Arrays.toString(arr) + " - is not Palindrome");

        }

    }
}
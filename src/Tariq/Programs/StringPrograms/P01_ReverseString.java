package Tariq.Programs.StringPrograms;

public class P01_ReverseString{

    public static void main(String[] args) {
        
        String str = "Tariq";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
    }
}
/*
1   Reverse a String
2	Check whether a String is Palindrome
3	Count Vowels, Consonants, Digits, and Special Characters
4   CountTotalCharactersInStringExcludingSpace.java
5	Count Frequency of Each Character in a String
6	Find Duplicate Characters in a String
7	Check whether Two Strings are Anagrams
8	Remove Duplicate Characters from a String
9	Reverse Each Word in a String
10	Find the First Non-Repeated Character in a String
*/
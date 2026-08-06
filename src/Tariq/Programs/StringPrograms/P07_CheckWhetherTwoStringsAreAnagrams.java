package StringPrograms;

import java.util.Arrays;

public class P07_CheckWhetherTwoStringsAreAnagrams {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) 
        {

            System.out.println("Not Anagram");

        } 
        else 
        {

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) 
            {
                System.out.println("Anagram");
            } 
            else 
            {
                System.out.println("Not Anagram");
            }
        }
    }
}
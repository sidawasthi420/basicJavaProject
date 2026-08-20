package Tariq.Programs.StringPrograms;

public class P02_CheckStringIsPalindrome {
    public static void main(String[] args) {

        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + ":- is Palindrome");
        } else {
            System.out.println(str + ":- is Not Palindrome");
        }
    }
}
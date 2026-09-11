package yashwin.Programs;

public class A51_DuplicateStrings {
    
    public static void main(String[] args) {

        String s1 = "abcabbea";
        String s2 = "ababeda";

        // Check each character of s1
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

           
            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (s1.charAt(j) == ch) {
                    alreadyChecked = true;
                    break;
                }
            }

           
            if (alreadyChecked) {
                continue;
            }

            // Count frequency in s1
            int count1 = 0;

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch) {
                    count1++;
                }
            }

            // Count frequency in s2
            int count2 = 0;

            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == ch) {
                    count2++;
                }
            }

            // Check if character is common
            // and has same frequency
            if ( count1 == count2) {
                System.out.println(ch + " -> " + count1);
            }
        }
    }
}

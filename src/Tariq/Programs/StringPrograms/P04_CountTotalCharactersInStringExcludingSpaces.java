package Tariq.Programs.StringPrograms;

public class P04_CountTotalCharactersInStringExcludingSpaces {

    public static void main(String[] args) {
        String str = "Java Programming";

        int count = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }

        }

        System.out.println(count);
    }
}

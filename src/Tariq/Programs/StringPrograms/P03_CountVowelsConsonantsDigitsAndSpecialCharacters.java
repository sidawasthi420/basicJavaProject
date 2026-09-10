package Tariq.Programs.StringPrograms;

public class P03_CountVowelsConsonantsDigitsAndSpecialCharacters {

    public static void main(String[] args) {

        String str = "TariqAhmad8057@gmail.com";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialCharacters = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }

            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }

            else if (ch >= '0' && ch <= '9') {
                digits++;
            }

            else if (ch == ' ') {
                continue;
            }

            else {
                specialCharacters++;
            }
        }

        System.out.println("String              : " + str);
        System.out.println("Vowels              : " + vowels);
        System.out.println("Consonants          : " + consonants);
        System.out.println("Digits              : " + digits);
        System.out.println("Special Characters  : " + specialCharacters);
    }
}
package Tariq.Programs.StringPrograms;

public class P09_ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "My Name Is Tariq";

		String[] words = str.split(" ");

		for (String word : words) {

			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}

			System.out.print(" ");
		}
	}
}

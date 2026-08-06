package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class P06_FindDuplicateCharactersInString {

    public static void main(String[] args) {

        String str = "Java Programs";
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (char ch : charArray) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }

}

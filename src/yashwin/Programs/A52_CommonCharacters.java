package yashwin.Programs;

import java.util.HashMap;
import java.util.Map;

public class A52_CommonCharacters {

    public static void main(String[] args) {

        String s1 = "abcabbe";
        String s2 = "ababed";

        // Create maps to store character frequency
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Count characters of s1
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }

        // Count characters of s2
        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);

            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }

        // Compare both maps
        for (char ch : map1.keySet()) {

            if (map2.containsKey(ch) &&
                map1.get(ch).equals(map2.get(ch))) {

                System.out.println(ch + " -> " + map1.get(ch));
            }
        }
    }
}
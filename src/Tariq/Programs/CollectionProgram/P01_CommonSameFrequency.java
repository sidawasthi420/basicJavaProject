package Tariq.Programs.CollectionProgram;

import java.util.HashMap;
import java.util.Map;

//Given two strings, s1 = "abcabbe" and s2 = "ababed", write a program to identify 
//all characters that are common to both strings and have the same frequency
public class P01_CommonSameFrequency {
    public static void main(String[] args) {

        String str1 = "abcabbe";
        String str2 = "ababed";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            if (map1.get(ch) == null) {
                map1.put(ch, 1);
            } else {
                map1.put(ch, map1.get(ch) + 1);
            }
        }

        for (char ch : str2.toCharArray()) {
            if (map2.get(ch) == null) {
                map2.put(ch, 1);
            } else {
                map2.put(ch, map2.get(ch) + 1);
            }
        }
        System.out.println("Characters common with same frequency:");
        for (char ch : map1.keySet()) {
            if (map2.containsKey(ch) && map1.get(ch).equals(map2.get(ch))) {
                System.out.println(ch);
            }
        }
    }
}
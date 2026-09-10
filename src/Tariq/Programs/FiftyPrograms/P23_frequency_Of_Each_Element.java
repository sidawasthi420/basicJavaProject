package Tariq.Programs.FiftyPrograms;

import java.util.HashMap;

//23. Find the frequency of each element: Count occurrences using a HashMap<Integer, Integer>.

public class P23_frequency_Of_Each_Element {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 2, 5, 3, 2, 4, 6 };

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr) {

            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        System.out.println(hashMap);
    }
}

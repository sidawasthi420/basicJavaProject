package yashwin.Programs;

import java.util.HashMap;

public class A23_CountFrequencyUsingHashMap {
    public static void main(String[] args) {

        //Creating an object of HashMap
        HashMap<Integer, Integer> hMap = new HashMap<>();

        //Creating array
        int[] arr = {2, 3, 4, 5, 6, 9, 5, 8, 7, 6, 5, 4};

        //Using for loop to count frequency of each element
        for (int i = 0; i < arr.length; i++) {

            if (hMap.containsKey(arr[i])) {
                hMap.put(arr[i], hMap.get(arr[i]) + 1);
            }
            else {
                hMap.put(arr[i], 1);
            }
        }

        //Displaying frequency of each element
        for (Integer key : hMap.keySet()) {
            System.out.println(key + " have " + hMap.get(key)+" frequency");
        }
    }
}
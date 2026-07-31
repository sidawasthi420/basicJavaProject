package RaviRaj;

import java.util.ArrayList;

public class occurance_array {  //Remove All Occurrences of an Element in an Array
    public static void main(String st[]){  
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);

        int element = 2;
        list.removeIf(num -> num == element);
        System.out.println("Array after removing all occurrences: " + list);
    }

    }
package collection;

import java.util.Map;
import java.util.TreeMap;

public class tree_map {

    public static void main(String[] args) {
        
        TreeMap<Integer,String> student_haspMap = new TreeMap<>();
        student_haspMap.put(1, "siddhant");
        student_haspMap.put(2, "tariq");
        student_haspMap.put(7, "priyanshu");
        student_haspMap.put(4, "ravi");
        student_haspMap.put(23, "luv");
        student_haspMap.put(21, "evil");
        student_haspMap.put(5, "siddhant");

        for(Map.Entry<Integer,String> entry:student_haspMap.entrySet()) {
            System.out.println("Key is : " + entry.getKey() + " Value is : "+ entry.getValue());
        }
    }
}

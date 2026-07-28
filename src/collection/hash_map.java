package collection;

import java.util.HashMap;
import java.util.Map;

public class hash_map {

    public static void main(String[] args) {
        
        HashMap<Integer,String> student_haspMap = new HashMap<>();
        student_haspMap.put(1, "siddhant");
        student_haspMap.put(2, "tariq");
        student_haspMap.put(4, "ravi");
        student_haspMap.put(7, "priyanshu");
        student_haspMap.put(23, "luv");
        student_haspMap.put(21, "evil");
        student_haspMap.put(null, "siddhant");

        for(Map.Entry<Integer,String> entry:student_haspMap.entrySet()) {
            System.out.println("Key is : " + entry.getKey() + " Value is : "+ entry.getValue());
        }
    }
}

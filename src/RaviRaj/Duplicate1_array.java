package RaviRaj;

import java.util.LinkedHashSet;

public class Duplicate1_array {  //Remove Duplicate Elements From an Array
    public static void main(String[] st){
        int[] arr = {11,55,22,90,44,44,55,22,11,20};
        LinkedHashSet<Integer> dup = new LinkedHashSet<>();  //LinkedHashSet preserves the order in which elements were added

        for(int num:arr){
            dup.add(num);

        }
        System.out.println("After removing duplicate elements");
        for(int num:dup){
            System.out.println(""+ num);

        }

    }
    
}

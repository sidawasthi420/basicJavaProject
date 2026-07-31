package RaviRaj;

import java.util.HashSet;

import collection.hash_set;

public class Duplicate_array { //Remove Duplicate Elements From an Array
    
    public static void main(String st[]){
        int[] arr = {10,10,12,20,20,22,30,30,34,90,60};
        HashSet<Integer> dup = new HashSet<>();    //HashSet does not guarantee the order of elements

        for(int i =0;i<arr.length;i++){
            dup.add(arr[i]);

        }
        System.out.println("Array after removing duplicate elements:>"+ dup);
    }
}

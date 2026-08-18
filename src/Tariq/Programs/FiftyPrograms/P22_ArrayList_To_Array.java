package Tariq.Programs.FiftyPrograms;

import java.util.ArrayList;

//22. Convert an ArrayList to an Array: Call the .toArray() method on your collection object.

public class P22_ArrayList_To_Array {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();


        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(6);

        Integer[] arr = arrayList.toArray(new Integer[0]);

        for(Integer i : arr){
            System.out.println(i);
        }


    }
}

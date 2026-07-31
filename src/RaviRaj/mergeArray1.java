package RaviRaj;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeArray1 {  //Merge Two Arrays using arraylist
    public static void main(String[] args) {

        Integer[] arr1 = {16, 24, 34};
        Integer[] arr2 = {24, 52, 63};

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println("Merged Array: " + list);
    }
}
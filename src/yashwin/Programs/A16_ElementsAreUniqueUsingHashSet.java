package yashwin.Programs;

//Importing package to use HashSet
import java.util.HashSet;

public class A16_ElementsAreUniqueUsingHashSet {
    public static void main(String[] args){

        //Creating HashSet object and restricting it to store only integer
        HashSet<Integer> haSet = new HashSet<>();

        //Creating an Array with duplicate values
        int[] arr = {2, 3, 4, 5, 6, 9, 5, 8, 7, 6, 5, 4};

        //Using for loop to store array element in HashSet
        for (int i : arr) {
            haSet.add(i);
        }

        //Checking if array length and hashSet size same or not
        if(arr.length == haSet.size()){
            System.out.println("All elements are Unique");
        }
        else {
            System.out.println("Duplicate elements are found");
        }

    }
}

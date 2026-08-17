package yashwin.Programs;

//Importing package to use HashSet
import java.util.HashSet;

public class A15_DuplicateElementsUsingHashSet {
    public static void main(String[] args){

        //Creating HashSet object and restricting it to store only integer
        HashSet<Integer> hSet = new HashSet<>();

        //Creating an Array with duplicate values
        int[] arr = {2, 3, 4, 5, 6, 9, 5, 8, 7, 6, 5, 4};

        //Using for loop to store array element in HashSet and it will return false if element already exist
        for(int i : arr){
            if(!hSet.add(i)){
                System.out.println("The duplicate value : " + i);
            }
        }
    }
}

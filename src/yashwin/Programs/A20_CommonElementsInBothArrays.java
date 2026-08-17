package yashwin.Programs;

//Importing package to use HashSet
import java.util.HashSet;

public class A20_CommonElementsInBothArrays {
    public static void main(String[] args){

        //Creating HashSet object and restricting it to store only integer
        HashSet<Integer> hSet = new HashSet<>();

        //Creating an Arrays with common values
        int[] arr1 = {2, 3, 4, 5, 6, 7};
        int[] arr2 = {4, 5, 6, 8, 9};

        //Using for loop to store 1st array elements in HashSet
        for(int i : arr1){
            hSet.add(i);
        }
         
        //Using for loop to verify if it is found in 1st array element in 2nd array
        for(int i : arr2){
            if(!hSet.add(i)){
                System.out.println(i + " is Common ");
            }
        }

    }
}

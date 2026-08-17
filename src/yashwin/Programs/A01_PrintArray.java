package yashwin.Programs;

import java.util.Arrays;

public class A01_PrintArray {
    public static void main(String[] args){
        
        //Creating an array
        int [] arr = {1,2,3,4,5,6,7,8};

        //Using Standard for loop to print
        System.out.println("Printing using Standard For loop ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        
        //Using Enhanced for loop (also called for-each loop) to print
        System.out.println("\nPrinting using Enhanced For loop ");
        for(int i: arr){
            System.out.print(i + "\t");
        }
        
        //Using .toString() to convert array into string
        String str = Arrays.toString(arr);
        System.out.println("\nPrinting after converting Array into String ");
        System.out.println(str);
        
    }
}

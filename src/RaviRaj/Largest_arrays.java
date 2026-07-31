package RaviRaj;

public class Largest_arrays {    //Find the Largest Element in an Array

    public static void main(String st[]){
        int[] big = {10,20,30,40,50,60,105};

        int largest = big[0];

        for(int i =1;i<big.length;i++){
            if(big[i]>largest){
                largest = big[i];
            }
        }
        System.out.println("Largest array is:> " + largest);
    }
}
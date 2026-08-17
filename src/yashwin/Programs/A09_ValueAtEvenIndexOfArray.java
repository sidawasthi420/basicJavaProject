package yashwin.Programs;

public class A09_ValueAtEvenIndexOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};

        //Displaying elements at even index
        for(int i =0; i<arr.length; i = i + 2){
            System.out.print(arr[i] + "\t");
        }
    }
}

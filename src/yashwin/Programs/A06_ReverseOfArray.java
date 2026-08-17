package yashwin.Programs;

public class A06_ReverseOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6};

        //Initialising a variable to store the start, end and temporary value
        int start = 0 ;
        int end = arr.length -1 ;
        int temp = 0;

        //Using while loop to swap each elements of an array 
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end] ;
            arr[end] = temp ;
            start ++;
            end --;
        }

        //Printing the reverse array
        for(int i : arr){
            System.out.print(i + "\t");
        }  
    }
}

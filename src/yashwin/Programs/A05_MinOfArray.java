package yashwin.Programs;

public class A05_MinOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};

        //Initialising a variable to store the Minimum value
        int min =arr[0];

        //Using for loop to iterate through each element and compare
        for(int i =0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        //Printing the Minimum value of an array
        System.out.println("Minimum value of an array : "+ min);
        
        
    }
}

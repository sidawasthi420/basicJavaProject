package yashwin.Programs;

public class A04_MaxOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};

        //Initialising a variable to store the Maximum value
        int max =arr[0];

        //Using for loop to iterate through each element and compare
        for(int i =0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        //Printing the Maximum value of an array
        System.out.println("Maximum value of an array : "+ max);
        
        
    }
}

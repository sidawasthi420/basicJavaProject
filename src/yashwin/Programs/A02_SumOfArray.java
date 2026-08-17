package yashwin.Programs;

public class A02_SumOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};

        //Initialising a variable to store sum
        int sum =0;

        //Using for loop to iterate through each element and sum
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        //Printing the total sum
        System.out.println("Sum of all elements of an array : "+sum);
        
        
    }
}

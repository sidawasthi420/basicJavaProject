package yashwin.Programs;

public class A17_SecondMaxOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};

        //Initialising a variable to store the Maximum and second maximum value
        int max =arr[0];
        int smax =arr[0];

        //Using for loop to iterate through each element and compare
        for(int i =0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        //Using for loop to iterate through each element and compare
        for(int i =0; i<arr.length; i++){
            if(arr[i] < max){
                if(smax < arr[i]){
                    smax = arr[i];
                }
            }
        }

        //Printing the Second Maximum value of an array
        System.out.println("Second maximum value of an array : "+ smax);
        
        
    }
}

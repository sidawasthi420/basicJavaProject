package yashwin.Programs;

public class A11_LinearSearch {
    //Creating a function of for loop to iterate through each element to check 
    public static boolean targetChecker(int[] arr , int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;

    }
    
    //Creating a function of conditional statements to check if target is in array by calling the targetChecker() function
    public static void targetFounder(int[] arr, int target){
        if(targetChecker(arr , target)){
            System.out.println("Target Found");
        }
        else {
            System.out.println("Target not found");
        }
    }

    public static void main(String[] args){
        
        //Creating an array with target
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};
        
        //Creating an array without target
        int[] arr1 = {2, 3, 4, 5, 6, 8, 7, 6, 5, 4};

        //Creating and setting a target
        int target = 9;

        //Calling function for array with target
        targetFounder(arr , target);
        
        //Calling function for array without target
        targetFounder(arr1 , target);

    }
}

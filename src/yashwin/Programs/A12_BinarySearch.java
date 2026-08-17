package yashwin.Programs;

public class A12_BinarySearch {
    //Creating a function of for loop to iterate through each element to check 
    public static boolean targetMatcher(int[] arr , int target, int low, int mid, int high){
        
        if(low > high){
            return false;
        }
        else if(arr[low] == target || arr[high] == target || arr[mid] == target){
            return true;
        } 
        else if(arr[mid] < target){
            low = mid + 1;
            mid = (low + high) / 2;

            return targetMatcher(arr, target,low, mid, high);
        }
        else if(arr[mid] > target){
            high = mid - 1;
            mid = (low + high) / 2;
            return targetMatcher(arr, target,low, mid, high);
        }
        return false;
    }
    
    //Creating a function of conditional statements to check if target is in array by calling the targetMatcher() function
    public static void targetFounder(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        if(targetMatcher(arr , target, low, mid, high)){
            System.out.println("Target Found");
        }
        else {
            System.out.println("Target not found");
        }
    }

    public static void main(String[] args){
        
        //Creating a sorted array with target
        int[] arr = {1,2,4,8,10,20,22,25,27,30};
        
        //Creating a sorted array without target
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        //Creating and setting a target
        int target = 22;

        //Calling function for array with target
        targetFounder(arr , target);
        
        //Calling function for array without target
        targetFounder(arr1 , target);

    }
}

package yashwin.Programs;

public class A10_SortedValueOfArray {

    //Creating a function of for loop to iterate through each element to check 
    public static boolean sortedArrayChecker(int[] arr){
        for(int i =0; i<arr.length -1; i++){
            if(arr[i] > arr[i + 1]){
                return true;
            }
        }
        return false;

    }
    
    //Creating a function of conditional statements to check if array is sorted by calling the sortedArrayChecker() function
    public static void sortArrayChecker(int[] arr){
        if(sortedArrayChecker(arr)){
            System.out.println("Array is not sorted ");
        }
        else {
            System.out.println("Array is sorted ");
        }
    }

    public static void main(String[] args){
        
        //Creating an unsorted array
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};

        //Creating a sorted array
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        //Calling function to check for unsorted array
        sortArrayChecker(arr);

        //Calling function to check for sorted array
        sortArrayChecker(arr1);

    }
}

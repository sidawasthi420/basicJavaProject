package yashwin.Programs;

public class A19_mergingTwoUnsortedArrays {

    public static void main(String[] args){

        //Creating array 1 
        int[] arr1 = {2, 5, 8, 1};

        //creating array 2
        int[] arr2 = {7, 3, 9, 4};

        //Creating merged array with boths combined length
        int[] mergedArr = new int[arr1.length + arr2.length];
        
        //Using for loop to store both arrays's element in new merged array
        for(int i=0; i<mergedArr.length; i++){
            
            if(i < arr1.length){
                mergedArr[i] = arr1[i];
            }
            else if(i >= arr1.length){
                mergedArr[i] = arr2[i - arr1.length];
            }
        }

        //Displaying new merged array elements
        for(int i : mergedArr){
            System.out.print(i + "\t");
        }
    }
    
}

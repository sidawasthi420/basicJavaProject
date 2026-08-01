package RaviRaj;

public class Duplicate_removedArray {
    public static void main(String[] args) {
        int[] arr = {12,32,34,34,34,34,5,56,56,78,67,78,878,989,89};
        System.out.println("Removed duplicates values");
        for(int i = 0; i<arr.length;i++){
            boolean isduplicate = false;
            for(int j =0;j<i;j++){
                if(arr[i]==arr[j]){
                 isduplicate = true;
                break;   
                }
            }
        if(!isduplicate){
            System.out.println(arr[i] + " ");
        }
        }
    }
    }
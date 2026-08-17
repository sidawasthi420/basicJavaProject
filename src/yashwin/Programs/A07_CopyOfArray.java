package yashwin.Programs;

public class A07_CopyOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6};

        //Creating a variable array to store copy of array of the same size
        int[] copyArr = new int[arr.length];
        

        //Using for loop to copy each element at the same index
        for(int i =0; i<arr.length; i++){
            copyArr[i] = arr[i];
        } 
        
        //Displaying the element of old array
        System.out.println("Old Array ");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + " At index " + i);
        }

        //Displaying the element of new copied array
        System.out.println("New copied Array ");
        for(int i =0; i<arr.length; i++){
            System.out.println(copyArr[i] + " At index " + i);
        }
    }
}

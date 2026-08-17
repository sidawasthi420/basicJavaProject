package yashwin.Programs;

public class A13_CountOccurrencesOfElementInArray {
    public static void main(String[] args){

        //Creating an array
        int[] arr = {2, 3, 4, 5, 6, 9,5, 8, 7, 6, 5, 4};

        //Setting target
        int target = 5;

        //Initializing counter to count
        int occur = 0;

        //Using for loop to count how manytimes target matched
        for(int i : arr){
            if(i == target){
                occur ++;
            }
        }

        //Displaying total count
        System.out.println("The total count Occurrence of an element in an Array : " + occur);
    }
    
}

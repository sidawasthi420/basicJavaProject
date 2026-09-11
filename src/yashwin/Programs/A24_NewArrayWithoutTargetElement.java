package yashwin.Programs;

public class A24_NewArrayWithoutTargetElement {
    public static void main(String[] args){

        //Creating array
        int[] arr = {2, 3, 4, 5, 6, 9, 5, 8, 7, 6, 5, 4};

        //Creating target element
        int target = 5;

        //Creating count to store the occurance of target element
        int count = 0;

        //Counting the occurance of target element
        for(int i: arr){
            if(target == i){
                count++ ;
            }
        }

        //Creating new array
        int[] arr1 = new int[arr.length - count];

        //Storing old array elements into new array
        for(int i=0; i<arr1.length; i++){
            if(target == arr[i]){
                i++;
                arr1[i] = arr[i];
            }
            else {
                arr1[i] = arr[i];
            }
        }

        for(int i : arr1){
            System.out.print(i + "\t");
        }

    }
}

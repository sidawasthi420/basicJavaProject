package yashwin.Programs;

public class P18_SecondMinOfArray {
    public static void main(String[] args){

        //Creating an array
        int[] arr = {12, 4, 5, 6, 9, 8,3, 7, 6, 5, 2};

        //Initialising a variable to store the Minimum and second minimum value
        int max = arr[0]; //12
        int smax = arr[1];//4
        int tmax = arr[2];

        //Using for loop to iterate through each element and compare to find min element
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        //Using for loop to iterate through each element and compare to find second min element
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < max && arr[i] > smax){
                smax = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < max && arr[i] < smax && arr[i] > tmax){
                tmax = arr[i];
            }
        }

        //Printing the second minimum value of an array
        System.out.println("First maximum value of an array : " + max);
        System.out.println("Second maximum value of an array : " + smax);
        System.out.println("Third maximum value of an array : " + tmax);

    }
}
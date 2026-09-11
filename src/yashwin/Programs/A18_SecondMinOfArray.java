package yashwin.Programs;

public class A18_SecondMinOfArray {
    public static void main(String[] args){

        //Creating an array
        int[] arr = {12, 4, 5, 6, 9, 8,3, 7, 6, 5, 2};

        //Initialising a variable to store the Minimum and second minimum value
        int min = arr[0]; //12
        int smin = arr[1];//4
        int tmin = arr[2];

        //Using for loop to iterate through each element and compare to find min element
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        //Using for loop to iterate through each element and compare to find second min element
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > min && arr[i] < smin){
                smin = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > min && arr[i] > smin && arr[i] < tmin){
                tmin = arr[i];
            }
        }

        //Printing the second minimum value of an array
        System.out.println("First minimum value of an array : " + min);
        System.out.println("Second minimum value of an array : " + smin);
        System.out.println("Third minimum value of an array : " + tmin);

    }
}
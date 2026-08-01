package RaviRaj;
//printing the array,array length and sum of all the arrays,largest number of the array and smallest number of the arrays

public class Full_array {
    public static void main(String[] args) {
        int[] arr = {12,23,34,123,34,3,544,34,34,44,43,3,434,2,3443,4343,43,34,34};
        int sum = 0;
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Length of the array is : " + arr.length);
        for(int i= 0;i<arr.length;i++){
            sum = sum+arr[i];

        }
        System.out.println("Sum of all the arrys are: " + sum);
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }

        }
        System.out.println("Largest value of the Array is : " + largest);
        for(int i =0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number of Arrays is: " + smallest);
    }   
}
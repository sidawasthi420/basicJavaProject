package yashwin.Programs;

public class A08_CountEvenAndOddOfArray {
    public static void main(String[] args){
        
        //Creating an array
        int[] arr = {2, 3, 4, 5, 6, 9, 8, 7, 6, 5, 4};

        //Initializing variables to count even and odd values
        int even = 0;
        int odd = 0;

        for(int i : arr){
            if(i % 2 == 0){
                even ++;
            }
            else {
                odd ++;
            }
        }

        //Displaying the value of even and odd
        System.out.println("Even element of Array : " + even + "\nOdd element of Array : " + odd);
    }
}

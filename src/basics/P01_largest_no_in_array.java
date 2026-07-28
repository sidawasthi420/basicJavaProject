package basics;

import java.util.Arrays;

public class P01_largest_no_in_array {

    public static void main(String[] args) {
        
        int[] arr = {324,56,567,345,234,567,678,345,345,678,345345,567,345,3456};
    
        Arrays.sort(arr);
        
        System.out.println(arr[0]);                //smallest
        System.out.println(arr[arr.length - 1]);   //largest
    }
}

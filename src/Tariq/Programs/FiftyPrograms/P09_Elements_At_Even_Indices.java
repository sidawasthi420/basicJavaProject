package Tariq.Programs.FiftyPrograms;

//9. Print elements at even indices: Iterate through the array using an increment step of i += 2.

public class P09_Elements_At_Even_Indices {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("index : " + i + ", element : " + arr[i]);
        }
    }
}

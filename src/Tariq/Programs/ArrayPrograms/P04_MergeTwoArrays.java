package Tariq.Programs.ArrayPrograms;

public class P04_MergeTwoArrays {

    public static void main(String[] args) {
        int[] arr = { 50, 2, 6 };
        int[] arr1 = { 6, 8, 1, 5 };

        int[] arr2 = new int[arr.length + arr1.length];

        int count = 0;

        for(int i: arr){

            arr2[count] = i;
            count++;

        }

        for(int i: arr1){
            arr2[count] = i;
            count++;
        }

        for(int j : arr2){
            System.out.println(j);
        }

    }

}

package Tariq.Programs.FiftyPrograms;

//19. Merge two unsorted arrays: Instantiate a third array with a combined length of both inputs and copy sequentially.

public class P19_Merge_Two_Unsorted_Arrays {

    public static void main(String[] args) {

        int[] arr1 = { 2, 5, 8, 3 };
        int[] arr2 = { 7, 1, 6, 4, 9 };

        int arr3Length = arr1.length + arr2.length;

        int[] arr3 = new int[arr3Length];

        for (int i = 0; i < arr1.length; i++) {

            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {

            arr3[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}

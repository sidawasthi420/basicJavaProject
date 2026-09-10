package Tariq.Programs.FiftyPrograms;

//38. Find the union of two sorted arrays: Merge elements into a TreeSet or use double pointers to handle duplicates.

public class P38_Union_Of_Two_Sorted_Arrays {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 6, 8 };

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                System.out.println(arr1[i]);
                i++;
            }

            else if (arr1[i] > arr2[j]) {

                System.out.println(arr2[j]);
                j++;

            } else {

                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

        // First while ke BAAD
        while (i < arr1.length) {

            System.out.println(arr1[i]);
            i++;
        }

        while (j < arr2.length) {

            System.out.println(arr2[j]);
            j++;
        }
    }
}
package Tariq.Programs.ArrayPrograms;

public class P05_SearchElementInArray {

    public static void main(String[] args) {
        int[] arr = { 50, 2, 6, 8, 2, 10, 6 };
        int search = 2;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {

                System.out.println("Element " + search + " found at index :- " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("element not found");
        }

    }

}

package Tariq.Programs.ArrayPrograms;

public class P03_RemoveAllOccurrencesElementInArray {

    public static void main(String[] args) {

        int[] arr = { 30, 10, 20, 80, 11, 0, 5, 20, 80, 11 };

        int remove = 11;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != remove) {
                System.out.println(arr[i]);
            }
        }

    }

}

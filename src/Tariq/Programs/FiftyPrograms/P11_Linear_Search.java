package Tariq.Programs.FiftyPrograms;

//11. Linear Search implementation: Loop sequentially to check if target matching arr[i] exists.

public class P11_Linear_Search {

    public static void main(String[] args) {

        int search = 5;
        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("Element " + search + " found at index : " + i);

                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("Element " + search + " not found");
        }

    }
}

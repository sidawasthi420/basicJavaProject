package ArrayPrograms;

public class P01_FindLargestElementInArray {

    public static void main(String[] args) {

        int[] arr = { 30, 10, 20, 80, 11, 0, 5, 20, 80, 11 };

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

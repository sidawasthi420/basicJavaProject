package Tariq.Programs.FiftyPrograms;

//18. Find the second smallest element: Keep references to smallest and secondSmallest while looping.

public class P18_Second_smallest_Element {

    public static void main(String[] args) {

        int[] arr = { 10, 5, 20, 8, 15, 25, 12 };

        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {

                secondSmallest = smallest;
                smallest = arr[i];
            }

            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest Element: " + smallest);
        System.out.println("Second Smallest Element: " + secondSmallest);

    }
}

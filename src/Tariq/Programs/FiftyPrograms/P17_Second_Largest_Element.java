package Tariq.Programs.FiftyPrograms;

//17. Find the second largest element: Track largest and secondLargest variables in a single pass.

public class P17_Second_Largest_Element {

    public static void main(String[] args) {

        int[] arr = { 10, 5, 20, 8, 15, 25, 12 };

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            }

            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = largest;
            }
        }

        System.out.println("largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);

    }
}

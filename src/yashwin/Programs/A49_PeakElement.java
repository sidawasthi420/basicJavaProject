package yashwin.Programs;

public class A49_PeakElement {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1 };

        // Check every element
        for (int i = 0; i < arr.length; i++) {

            // Check first element
            if (i == 0 && arr[i] > arr[i + 1]) {

                System.out.println("Peak element: " + arr[i]);
                break;
            }

            // Check last element
            else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {

                System.out.println("Peak element: " + arr[i]);
                break;
            }

            // Check middle elements
            else if (i > 0 && i < arr.length - 1
                    && arr[i] > arr[i - 1]
                    && arr[i] > arr[i + 1]) {

                System.out.println("Peak element: " + arr[i]);
                break;
            }
        }
    }
}
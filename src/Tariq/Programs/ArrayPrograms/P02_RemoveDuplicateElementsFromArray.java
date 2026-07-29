package ArrayPrograms;

public class P02_RemoveDuplicateElementsFromArray {

    public static void main(String[] args) {

        int[] arr = { 30, 10, 20, 80, 11, 0, 5, 20, 80, 11 };

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {

                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.println(arr[i]);
            }
        }

    }
}

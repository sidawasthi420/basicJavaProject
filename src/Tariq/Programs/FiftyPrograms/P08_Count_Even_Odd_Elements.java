package Tariq.Programs.FiftyPrograms;

//8. Count even and odd elements: Traverse the array using a conditional modulus check (arr[i] % 2 == 0).
public class P08_Count_Even_Odd_Elements {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even elements= " + even);
        System.out.println("odd elements= " + odd);

    }
}

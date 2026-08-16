
package Tariq.Programs.FiftyPrograms;

//2. Find the sum of all elements: Iterate through the array and accumulate values into a tracking variable.
public class P02_SumOfArray {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 4, 3, 2 };
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("Sum :- " + sum);
    }
}
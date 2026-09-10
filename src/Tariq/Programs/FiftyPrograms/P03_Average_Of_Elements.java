package Tariq.Programs.FiftyPrograms;

//3. Calculate the average of elements: Calculate the sum of the array and divide by array.length using a double cast.

public class P03_Average_Of_Elements {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 4, 3, 2 };

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);

    }
}

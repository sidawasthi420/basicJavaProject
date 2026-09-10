package Tariq.Programs.FiftyPrograms;

//35. Find missing number in a continuous range: Calculate the expected sum with n*(n+1)/2 and subtract the actual sum.

public class P35_Find_Missing_Number_In_Continuous_Range {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6 };

        int totalNum = arr.length + 1;

        int expectedSum = totalNum * (totalNum + 1) / 2;

        int actualSum = 0;

        int missingNum;

        for (int i : arr) {

            actualSum += i;
        }

        missingNum = expectedSum - actualSum;
        System.out.println(missingNum);

    }
}

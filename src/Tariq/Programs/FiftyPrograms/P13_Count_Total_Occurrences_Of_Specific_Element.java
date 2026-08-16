package Tariq.Programs.FiftyPrograms;

//13. Count total occurrences of a specific element: Loop through the array and increment a counter whenever the target matches.

public class P13_Count_Total_Occurrences_Of_Specific_Element {

    public static void main(String[] args) {
        
        int[] arr = {2,3,5,6,8,9,2,3,4,2,6,5,4,3};
        int element = 2;

        int count = 0;
        for(int i=0; i<arr.length; i++){

            if(element == arr[i]){
                count++;
            }
        }

        System.out.println(element + " found:- " + count + " times");
    }
}

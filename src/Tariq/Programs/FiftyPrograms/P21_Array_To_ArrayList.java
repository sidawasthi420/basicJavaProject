package Tariq.Programs.FiftyPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//21. Convert an Array to an ArrayList: Employ the native Arrays.asList(array) method.

public class P21_Array_To_ArrayList {

    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 3, 7, 6 };

       ArrayList<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        
  //      ArrayList<Integer> arrList = new ArrayList<>(Arrays.stream(arr).boxed());
//         import guava jar files
//        ArrayList<Integer> arrList = Lists.newArrayList(Ints.asList(arr));

/*    for(int i : arr){
            arrList.add(i);
        }
*/
       System.out.println(list1);

    }
}

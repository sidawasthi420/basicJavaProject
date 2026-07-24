package collection;
import java.util.ArrayList;

public class array_list {

    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<>();
        list.add(34);      //index = 0
        list.add(4545);    //index = 1
        list.add("sidd");  //compile time error
        list.add(454);     //index = 2
        list.add(null);
        list.add(23.343f);
        list.add(543535);  //index = 3
        list.add(4545);    //index = 4
        list.add(null);
        list.add(null);
        list.add(454);     //index = 5
        list.add(true);

        for(Object i:list)   //for-each
        {
            System.out.println(i);
        }

        // ArrayList<String> list1 = new ArrayList<>();
        // list1.add(343);
    }
}

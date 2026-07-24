package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linked_list {

    public static void main(String[] args) {
        
        LinkedList<Object> list = new LinkedList<>();
        list.add(34);      //index = 0
        list.add(4545);    //index = 1
        list.add("sidd");  //index = 2
        list.add(454);     //index = 3
        //list.remove();       //it will remove the last added value [i.e. 3 index]
        list.add(null);     //index = 4
        list.add(23.343f);     //index = 5
        list.add(543535);  //index = 6
        list.add(4545);    //index = 7
        list.add(null);      //index = 8
        list.add(null);     //index = 9
        list.add(454);     //index = 10
        list.add(true);        //index = 11

        Iterator itr = list.iterator();

        //itr ----> 34 4545 sidd null 23.343 543535 4545 null null 454 true
    
        while(itr.hasNext())
        {
            System.out.println(itr.next());   //34 4545 sidd ............................. 454 true
        }

    }
}

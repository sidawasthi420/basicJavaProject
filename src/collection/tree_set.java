package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class tree_set {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("siddhant");
        treeSet.add("tariq");
        treeSet.add("ravi");
        treeSet.add("siddhant");
        treeSet.add("sidhu");
        //treeSet.add(null);     //Runtime Error
        treeSet.add("luv");
        treeSet.add("prasant");
        treeSet.add("ravi");
        treeSet.add("tariq");

        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

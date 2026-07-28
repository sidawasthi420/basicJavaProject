package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hash_set {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(45);
        hashSet.add(4545);
        hashSet.add(4535);
        hashSet.add(57575);
        hashSet.add(null);
        hashSet.add(4545);
        hashSet.add(3434);
        hashSet.add(null);

        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()) { 
            System.out.println(itr.next());
        }
    }
}

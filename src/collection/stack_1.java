package collection;

import java.util.Iterator;
import java.util.Stack;

public class stack_1 {

    public static void main(String[] args) {
      
      //Last In First Out
      Stack<Object> stack = new Stack<>();
      stack.push(34);
      stack.push(67);
      stack.add(45);
      stack.push(56);

      Iterator itr = stack.iterator();
      //34 67 45 56

      while(itr.hasNext())
      {
        System.out.println(itr.next());
      }

      stack.pop();  //56

      Iterator itr1 = stack.iterator();

      while(itr1.hasNext())
      {
        System.out.println(itr1.next());
      }

      System.out.println("Capacity of stack :- " + stack.capacity());
    }
}

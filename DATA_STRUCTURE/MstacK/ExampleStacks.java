package DATA_STRUCTURE.MstacK;
//import java.util.*;

public class ExampleStacks {
    public static void main(String[] args) throws Exception{
      /*  Stack<Integer> x = new Stack<>();

       x.push(34);
       x.push(48);
       x.push(89);
       x.push(02);
       System.out.println(x);
       x.pop();
       x.pop();
       System.out.println(x);
       System.out.println(x.peek());
       System.out.println(x.pop()); */
       MyStack<Integer> al = new MyStack<>();
       al.push(45);
       al.push(73);
       al.push(82); 
       int popped = al.pop();
       System.out.println(popped);
       int peeked = al.peek();
       System.out.println(peeked);
       
    }
}
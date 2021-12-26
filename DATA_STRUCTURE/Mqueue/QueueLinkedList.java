package DATA_STRUCTURE.Mqueue;
//------------------------------------USING LINKED LIST-------------------------------------

/* import java.util.LinkedList;
import java.util.Queue; */

public class QueueLinkedList {
    public static void main(String[] args) {
        /* Queue<String> q = new LinkedList<>();
        q.add("shammi");
        q.add("sameer");
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.poll()); */
        MyQueue<Integer> x = new MyQueue<>();
        x.enqueue(3);
        x.enqueue(88);
        x.enqueue(144);
        x.enqueue(9221);
        System.out.println(x.dequeue());
        System.out.println(x.dequeue());
        System.out.println(x.peek());
    }
   
    
    

}
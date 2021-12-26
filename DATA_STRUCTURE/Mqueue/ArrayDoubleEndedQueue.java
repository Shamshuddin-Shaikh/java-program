package DATA_STRUCTURE.Mqueue;

import java.util.ArrayDeque;

public class ArrayDoubleEndedQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.addFirst(34);
        d.addFirst(456);
        d.removeLast();
        System.out.println(d.peek());
        d.push(88);
        d.push(92);
        d.push(12);
        d.pop();
        System.out.println(d.peek());
    }
}
package DATA_STRUCTURE.Listts;

import java.util.*;
//import java.util.LinkedList;

public class ExampleLinkedList {
    public static void main(String[] args) {
        //LinkedList<Integer> ll = new LinkedList<>();
       /*  List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>(); */
       /*  ll.add(32);
        ll.add(77);
        System.out.println(ll); */
        /* getTimeDiff(al);
        getTimeDiff(ll);
 */
        MylinkedLIst<Integer> ex = new MylinkedLIst<>();
        ex.add(23);
        ex.add(35);
        ex.print();
        for(int i=0;i<10;i++){
            ex.add(i);
        }
        ex.print();

        
    }
    //just to know that how efficient linked list is by comparing with array list
    static void getTimeDiff(List<Integer> list){

        long  start = System.currentTimeMillis();
        for(int i=0; i<100000;i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() + " "+ (end-start));

    }
}
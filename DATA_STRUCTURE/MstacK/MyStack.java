package DATA_STRUCTURE.MstacK;

import DATA_STRUCTURE.Listts.MylinkedLIst;

public class MyStack<E> {
    private MylinkedLIst<E> a = new MylinkedLIst<>();
    
    void push(E e){
        a.add(e);
    }
    E pop() throws Exception{
        if(a.isEmpty()){
            throw new Exception("popping in empty stack");
        }
        return a.removeLast();


    }
    E peek() throws Exception {
        if(a.isEmpty()){
            throw new Exception("peeking in empty stack");
        }
        return a.getLast();
     }
}
package DATA_STRUCTURE.Mqueue;

import DATA_STRUCTURE.Listts.MylinkedLIst.Node;

public  class MyQueue<E> {
    private Node<E> head,rear;
    
    public void enqueue(E e) {
        Node<E> toAdd = new Node<>(e);
        if(head==null){
            head=rear=toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public E dequeue(){
        if(head==null){
            return null;
        }

        Node<E> temp = head;
        if(head==null){
            rear = null;
        }
        head = head.next;
        return temp.data;

    }
    public E peek(){
        if(head==null){
            return null;
        }

        Node<E> temp = head;
        if(head==null){
            rear = null;
        }
        return temp.data;
    }
}
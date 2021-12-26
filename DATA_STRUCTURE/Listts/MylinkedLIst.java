package DATA_STRUCTURE.Listts;

public class MylinkedLIst<E> {
    Node<E> head; 

    public boolean isEmpty(){
        return head==null;
    }


   public void add(E data){
        Node<E> toadd = new Node<>(data);
        
        if(isEmpty()){
            head= toadd;
            return;
        }
        Node<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toadd;
    }

    public E removeLast() throws Exception {
        Node<E> temp = head;
        if(temp==null){
            throw new Exception("you can not remove last element from empty list");
        }
        if(temp.next==null){
            Node<E> toremove = head;
            head = null;
            return toremove.data;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        Node<E> toremove = temp.next;
        temp.next = null;
        return toremove.data;
    }

    public E getLast() throws Exception {
        Node<E> temp = head;
        if(temp==null){
            throw new Exception("you can not peek from last element from empty list");
        }
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }

   public void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        } 
    }


    public static class Node<E> {
       public E data;
       public Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}
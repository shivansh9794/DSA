class Node {
    int value;
    Node next;
}


public class SinglyLinkedList1 {
    
    Node head;
    Node tail;
    int size=0;

    Node createSinglyLinkedList(int NodeValue){

    
        Node node1=new Node();

        node1.value=NodeValue;
        node1.next=null;

        head=node1;
        tail=node1;

        size++;

        return head;

    }

    public static void main(String[] args) {


        SinglyLinkedList1 sll = new SinglyLinkedList1();
        sll.createSinglyLinkedList(2);
        System.out.println(sll.head.value);


    }
}

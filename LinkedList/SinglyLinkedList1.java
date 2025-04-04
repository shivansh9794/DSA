class Node {
    int value;
    Node next;
}


public class SinglyLinkedList1 {
    
    static Node head;
    // Node tail;
    int size=0;

    Node createSinglyLinkedList(int NodeValue){
    
        Node node1=new Node();

        if(head==null){
            head.value= NodeValue;
            head.next=null;
        }
        else{
            head.value=NodeValue;
            head.next.next=null;
            size++;
        }

        // node1.value=NodeValue;
        // node1.next=null;

        // head=node1;
        // tail=node1;

        return head;

    }

    public static void main(String[] args) {


        SinglyLinkedList1 sll = new SinglyLinkedList1();
        sll.createSinglyLinkedList(2);
        sll.createSinglyLinkedList(4);

        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }


    }
}

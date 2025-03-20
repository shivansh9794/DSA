class Node{
    public int value;
    public Node next;
}


public class sll2 {

    Node head;
    Node tail;
    int size;


    public Node createLinkedList(int n,int m){


        Node node= new Node();
        Node newNode=new Node();


        node.value=n;
        node.next=newNode;
        
        newNode.value=m;
        newNode.next=null;

        head=node;
        // tail.next=newNode;
        size++;

        return head;
    }

    public static void main(String[] args) {

        sll2 s= new sll2();
        s.createLinkedList(2,3);

        

        for(Node a=s.head; a!=s.tail; a=s.head.next){
            System.out.println(a.value);
        }
        
    }
}

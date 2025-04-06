class Node {
    int value;
    Node next;

    Node(int data) {
        this.value = data;
        this.next = null;
    }
}

class LinkedList{

    Node head;

    // Add a new node at the end
    void add(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void printList() {

        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        
        System.out.println("null");
    }

}

class SinglyLinkedList1{
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(10);
        l.printList();
    }
}
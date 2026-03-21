// Create a singly linked list and print all elements

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkList1 {

    Node head;

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Attach new node
        last.next = newNode;
    }

    // Print linked list
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkList1 ll = new LinkList1();

        // Insert elements
        for (int i = 0; i < 10; i++) {
            ll.insert(i);
        }

        // Print list
        ll.printList();
    }
}

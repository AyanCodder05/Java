class node {
    int data;
    node next;

    public node(int n) {
        this.data = n;
        this.next = null;
    }
}

public class ReverseLL {

    static node reversell(node head) {
        node curr = head;
        node prev = null;
        node next;

        while (curr != null) {
            next = curr.next;     // save next
            curr.next = prev;     // reverse link
            prev = curr;          // move prev
            curr = next;          // move curr
        }

        return prev;  // new head
    }

    static void printList(node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create list: 1 -> 2 -> 3 -> null
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);

        System.out.print("Original: ");
        printList(head);

        head = reversell(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}

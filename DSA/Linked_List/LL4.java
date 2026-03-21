class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}
public class LL4{
    Node head;
    public void linkedlist(int data){
        Node node= new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node last=head;
        while (head.next!=null) { 
            last=last.next;

        }

        last.next=node;

    }
    public void print(){
        Node current=head;
        while (current!=null) { 
            System.out.println(current.data+"->");
            current=current.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL4 ll=new LL4();
        ll.linkedlist(1);
        ll.linkedlist(2);

        ll.print();
    }
}
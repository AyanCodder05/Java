class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}


class Queue_LinkList{

    Node head;
    Node tail;
    int size;

    public void enqueue(int data){
        Node newNode=new Node(data);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    public int dequeue(){
        if(head==null && tail ==null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int data=head.data;
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        }
        size--;
        return data;
    }

    public boolean isEmpty(){
        return head==null && tail==null;
    }

    public int peek(){
        if(head==null && tail==null) return -1;
        return head.data;
    }

}
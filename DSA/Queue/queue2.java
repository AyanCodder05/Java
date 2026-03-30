class node{
    int data;
    node next;
    public node(int n) {
        this.data=n;
        this.next=null;
    }


}

class myqueue{
    node head;
    node tail;
    int size;
    
    public myqueue() {
        
        head=null;
        tail=null;
        size=0;
    }


    public void enqueue(int data){

        node newNode=new node(data);
        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

        size ++;

        
    }

    public int peek(){
    if(head==null) return -1;
    return head.data;
}

public boolean isEmpty(){
    return size == 0;
}

    // public void dequeue(){
    //     if(head==null){
    //         return;
    //     }
    //     head=head.next;

    //     if(head==null){
    //         tail=null;
    //     }
    //    size--;
    // }

    public int dequeue(){
    if(head==null){
        return -1; // or throw exception
    }

    int val = head.data;
    head = head.next;

    if(head==null){
        tail=null;
    }

    size--;
    return val;
}

    public void printQueue(){

        if(head == null){
            System.out.println("Queue is empty");
            return;
        }
        node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }

        System.out.println("null");
    }
    
}

public class queue2{
    public static void main(String[] args) {
        myqueue queue=new myqueue();
        queue.enqueue(12);
        queue.enqueue(10);
        queue.enqueue(30);

        queue.printQueue();

        queue.dequeue();
        System.err.println();
        queue.printQueue();
    }
}




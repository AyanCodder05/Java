class node{
    int data;
    node next;

    node(int n) {
        this.data=n;
        this.next=null;
    }
    
    
}

class ll1{
    node head;
    
    public void insert(int data){
        node Node=new node(data);
        if(head==null){
            head=Node;
            return;
        }

        node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=Node;
    }
    
    public void insertAtBeginning(int data){
        node newNode=new node(data);
        newNode.next=head;
        head=newNode;
    }
}
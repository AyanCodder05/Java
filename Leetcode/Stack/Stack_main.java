
import java.util.Stack;

// --------------Using array-----------
class StackArray{
    int[] array;
    int capacity;
    int top;

    public StackArray(int data) {
        this.capacity=data;
        array=new int[capacity];
        top=-1;
    }

    public void push(int data){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        array[++top]=data;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return array[top--];
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==capacity-1;
    }
    
}


//----------Using Linklist--------------
class Node{
    int data;
    Node next;

    Node(int n){
        this.data=n;
        this.next=null;
    }
}

class MyStack{
    Node top;
    int count;

    public MyStack(int n) {
        this.top=null;
        this.count=0;
    }

    

    public void push(int data){
        Node node=new Node(data);
        node.next=top;
        top=node;

        count++;
    }

    public int pop(){
        if(top==null){
            System.out.println("Stack overflow");
            return -1;
        }

        Node temp=top;
        top=top.next;
        int val=temp.data;
        count--;

        return val;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return count;
    }

}

class Stack_main{
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();

        st.push(1);
    }
}
/*
206. Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []
*/
class LLnode{
    int data;
    LLnode next;

    LLnode(int n){
        this.data=n;
        this.next=null;
    }
}

class ll4_206{
    LLnode head;
    public void insert(int data){
        LLnode node =new LLnode(data);
        if(head==null){
            head=node;
            return;
        }

        LLnode last=head;
        while(last!=null){
            last=last.next;
        }
        last.next=node;
    }

    public LLnode reverse(){
        LLnode prev=null;
        LLnode next;
        LLnode curr=head;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}
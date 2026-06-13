/*
876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

Leetcode: https://leetcode.com/problems/middle-of-the-linked-list/description/

*/

class llnode{
    int data;
    llnode next;

    llnode(int n) {
        this.data=n;
        this.next=null;
    }
    
}

class ll3_876{

    llnode head;

    public void insert(int data){
        llnode node=new llnode(data);

        if(head==null){
            head=node;
            return;
        }

        llnode last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
    }

    public void middle(){
        llnode slow=head;
        llnode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println(slow.data);
    }
}
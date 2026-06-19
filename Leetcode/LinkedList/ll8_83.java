

/*
83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
*/
class LinkedListNode{
    int data;
    LinkedListNode next;

    public LinkedListNode(int n) {
        this.data=n;
        this.next=null;
    }
}

class ll8_83{
    
    public LinkedListNode deleteDuplicates(LinkedListNode head) {

        LinkedListNode current=head;

        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }

            else{
                current=current.next;
            }
        }
        return head;  
    }
}

/*
Complexity Analysis:

Time Complexity: O(n)
Each node is visited at most once.

Space Complexity: O(1)
No extra data structure is used.
*/
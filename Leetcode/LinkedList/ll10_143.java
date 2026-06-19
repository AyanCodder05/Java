/*
143. Reorder List
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

Example 1:
Input: head = [1,2,3,4]
Output: [1,4,2,3]

Example 2:
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 
Leetcode link: https://leetcode.com/problems/reorder-list/
*/
class LLnode{
    int data;
    LLnode next;

    LLnode(int n){
        this.data=n;
        this.next=null;
    }
}
class ll10_143{
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

    public void reorderList(LLnode head) {
        if(head==null || head.next==null) return;

        // Step 1: Find the middle of the linked list
        LLnode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        LLnode prev=null, curr=slow, next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        // Step 3: Merge the two halves
        LLnode first=head, second=prev;
        while(second.next!=null){
            next=first.next;
            first.next=second;
            first=next;

            next=second.next;
            second.next=first;
            second=next;
        }
    }
}


/*
Another Solution:

class Solution {
  public static void reorderList(ListNode head) {
    if (head == null) {
      return;
    }
    reorderList(head, head.next);
  }

  private static ListNode reorderList(ListNode slow, ListNode fast) {
    if (fast == null) {
      // odd size, keep only slow as central
      ListNode temp = slow.next;
      slow.next = null;
      return temp;
    } else if (fast.next == null) {
      // even size, keep slow and slow.fast as central
      ListNode temp = slow.next.next;
      slow.next.next = null;
      return temp;
    } else {
      ListNode middle = reorderList(slow.next, fast.next.next);
      ListNode result = middle.next;
      ListNode temp = slow.next;
      slow.next = middle;
      middle.next = temp;
      return result;
    }
  }
}
*/



/*
19. Remove Nth Node From End of List

Given the head of a linked list, remove the nth node from the end of the list and return its head. 

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]

Leetcode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
*/
class LinkNode{
    int data;
    LinkNode next;

    LinkNode(int n) {
        this.data=n;
        this.next=null;
    }
}

class ll6_19{
    LinkNode head;
    public LinkNode removeNthFromEnd(int n){
        LinkNode node=new LinkNode(0);
        node.next=head;
        LinkNode slow=node;
        LinkNode fast=node;

        for (int i = 0; i <n; i++) {
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return node.next;
    }
}

/*
# LeetCode 19 - Remove Nth Node From End of List

## Problem

Given a linked list and an integer n, remove the nth node from the end of the list and return the head.

Example:

1 -> 2 -> 3 -> 4 -> 5

n = 2

Output:

1 -> 2 -> 3 -> 5

Because the 2nd node from the end is 4.

---

# Pattern

Fast Pointer + Slow Pointer

This is not:

* HashMap Pattern
* Frequency Pattern
* Two Pointer Array Pattern

This is a Linked List Fast/Slow Pointer Pattern.

---

# Brute Force Approach

Step 1:
Count total nodes.

Example:

1 -> 2 -> 3 -> 4 -> 5

Count = 5

Step 2:
Find node before deletion position.

5 - 2 = 3

Move to node 3.

Step 3:
Delete node 4.

Time Complexity:
O(n) + O(n)

Space Complexity:
O(1)

---

# Optimal Approach

## Main Idea

Keep fast pointer n nodes ahead of slow pointer.

Example:

1 -> 2 -> 3 -> 4 -> 5

n = 2

Initial:

slow = dummy
fast = dummy

Move fast 2 steps:

slow = dummy
fast = 2

Now maintain gap.

Move both together.

When fast reaches the last node:

slow reaches the node before the one to delete.

---

# Why Dummy Node?

Without Dummy:

head
↓
1 -> 2 -> 3 -> 4 -> 5

If n = 5:

Need to remove node 1.

There is no previous node before head.

Special case required.

---

With Dummy:

dummy -> 1 -> 2 -> 3 -> 4 -> 5

Now node 1 has a previous node:

dummy

Deletion becomes normal.

No special case needed.

---

# Algorithm

Step 1:

Create dummy node.

dummy.next = head

Step 2:

slow = dummy
fast = dummy

Step 3:

Move fast n steps.

Step 4:

Move both pointers together until:

fast.next == null

Step 5:

Delete node.

slow.next = slow.next.next

Step 6:

Return:

dummy.next

---

# Dry Run

List:

1 -> 2 -> 3 -> 4 -> 5

n = 2

Move fast 2 steps:

slow = dummy
fast = 2

Move together:

Iteration 1:

slow = 1
fast = 3

Iteration 2:

slow = 2
fast = 4

Iteration 3:

slow = 3
fast = 5

Stop.

Delete:

slow.next = slow.next.next

3.next = 5

Result:

1 -> 2 -> 3 -> 5

---

# Final Code

class Solution {

```
public ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode slow = dummy;
    ListNode fast = dummy;

    for(int i = 0; i < n; i++){
        fast = fast.next;
    }

    while(fast.next != null){
        slow = slow.next;
        fast = fast.next;
    }

    slow.next = slow.next.next;

    return dummy.next;
}
```

}

---

# Mistakes I Made While Learning

## Mistake 1

return slow.next = slow.next.next;

Wrong.

Reason:

This returns the deleted node's replacement, not the head.

Correct:

slow.next = slow.next.next;
return dummy.next;

---

## Mistake 2

Thinking dummy node improves time complexity.

Wrong.

Dummy node does NOT make code faster.

Purpose:

Handle head deletion.

---

## Mistake 3

Confusing:

n = 5

with

remove node 5

Wrong.

n means:

5th node from the END.

Example:

1 -> 2 -> 3 -> 4 -> 5

n = 5

Remove:

1

---

## Mistake 4

Focusing on main logic but missing edge cases.

Edge Cases:

* n = length
* Single node list
* Head deletion
* Last node deletion

---

# Interview Questions

Q1. Why use a dummy node?

Answer:

To handle head deletion the same way as normal deletion.

Q2. Why move fast n steps first?

Answer:

To maintain a gap of n nodes between fast and slow.

Q3. Why return dummy.next?

Answer:

The head may change after deletion.

Q4. Time Complexity?

O(n)

Q5. Space Complexity?

O(1)

---

# Key Formula

Fast moves n steps first.

Then:z

while(fast.next != null)

```
slow = slow.next
fast = fast.next
```

After loop:

slow points to the node before the node that must be deleted.
*/
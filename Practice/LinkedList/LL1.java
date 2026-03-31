class node{
    int data;
    node next;

    node(int n) {
        this.data=n;
        this.next=null;
    }
    
}

public class  LL1{

    node head;
    public void insert(int data){
        node Node=new node(data);

        if(head ==null){
            head=Node;
            return;
        }

        node last=head;
        while(last.next!=null){
             last=last.next;
        }
        last.next=Node;
    }

    //------Reverse-------

    public node reverse(node head){
        node pre=null, curr=head,next;

        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    
    //-------Palindrome---------

    public boolean isPalindrome() {
        if(head == null || head.next == null) return true;

        node slow = head, fast = head;

    // find middle
      while(fast.next != null && fast.next.next != null){
          slow = slow.next;
          fast = fast.next.next;
        }

    // reverse second half
      node secondHalf = reverse(slow.next);

      node firstHalf = head;
      node copySecond = secondHalf;

      while(copySecond != null){
          if(firstHalf.data != copySecond.data){
               return false;
            }
            firstHalf = firstHalf.next;
            copySecond = copySecond.next;
        }

    // restore list
        slow.next = reverse(secondHalf);

        return true;
    }


    /*
    public void isPalindrome(){
        //Step 1- Find Middle
        node fast=head;
        node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        //Step-2: Reverse
        node reverse=reverse(slow.next);

        //Step-3: Compare
        node first=head;
        node second=reverse;
        boolean isPal=true;
        while(second !=null){
            if(first.data!=second.data){
                isPal=false;
                break;
            }
            first=first.next;
            second=second.next;
        }

        if(isPal){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
    */



    //------Cyclic-------
    public void cyclic(int targetIndex){
        if(head ==null) return;

        
        node target=head;
        for(int i=0; i<targetIndex; i++){

            target=target.next;

        }

        node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=target;
    }

    //--------Is Cycle-------
    public boolean isCycle(){
        node fast=head;
        node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
              return true;
            }
        }
        return false;
    }

    //-------Deleted cycle--------
    public void deletedCycle(){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow= slow.next;
            if(slow==fast){
                break;
            }
        }

        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        node cycle=slow;
        node next=cycle;
        while(next.next!=cycle){
            next=next.next;
        }
        next.next=null;
    }

    //-------Middle-------
    public void miidle(){
        node fast=head;
        node slow=head;
        if(head==null){
            return;
        }

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        System.out.print(slow.data);


    }

    public static void main(String[] args) {
        LL1 linkedlist =new LL1();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);

        linkedlist.miidle();
    }

}
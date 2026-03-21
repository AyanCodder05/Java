
import java.util.LinkedList;

// Insert a new node at the head of the linked list.
public class LL2{

    public static void main(String[] args) {

        LinkedList<Integer>ll = new LinkedList<>();
        // for (int i = 1; i <= 10; i++){
        //  ll.add(i);
        // }
        ll.addFirst(1);
        ll.addFirst(2);

        System.out.println(ll);


    }
}
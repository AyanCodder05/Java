
import java.util.LinkedList;

// Find the Middle of a Linked List
public class LL3{
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }
        System.out.println(ll);
        int n=ll.size();
        
          
           if(n%2!=0){
            int index=(n+1)/2-1;
            System.out.println(ll.get(index));
           }
           else{
            System.err.println("Please Enter odd element");
           }
        

    }
}
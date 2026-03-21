import java.util.LinkedList;
import java.util.Stack;

public class Stack3 {


    //-------- Array version -----------
    // public void nextsmaller(int arr[]){
    //     int n= arr.length;
    //     int [] result=new int[n];
    //     Stack <Integer> st=new Stack<>();
    //     for (int i =n-1; i >=0; i--) {
    //         int curr=arr[i];
    //         while (!st.isEmpty() && arr[st.peek()]>=curr) { 
    //             st.pop();
    //         }
    //         if(st.isEmpty()) result[i]=-1;
    //         else result[i]=arr[st.peek()];
    //         st.push(i);
    //     }

    //     for (int i = 0; i < n; i++) {
    //         System.out.print(result[i] + " ");
            
    //     }

    // }


    //-------------Time Complexity: O(n) ---------------



    // ------------ Link List Version -----------------

    LinkedList<Integer> ll = new LinkedList<>();

    public void nextsmallerLL() {

        int n = ll.size();

        LinkedList<Integer> result = new LinkedList<>();

        // initialize result list
        for(int i = 0; i < n; i++){
            result.add(-1);
        }

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            int curr = ll.get(i);

            while (!st.isEmpty() && ll.get(st.peek()) >= curr) {
                st.pop();
            }

            if (st.isEmpty()) {
                result.set(i, -1);
            } 
            else {
                result.set(i, ll.get(st.peek()));
            }

            st.push(i);
        }

        System.out.println(result);
    }
    
    //---------- Time Complexity: O(n²) ---------------


    //*+++++++++++* Note *+++++++++++*//
    //--- Can this be optimized further? --- //
    // Ans: No. Because: O(n) is optimal because every element must be processed at least once.

    public static void main(String[] args) {

        Stack3 stack = new Stack3();

        stack.ll.add(3);
        stack.ll.add(1);
        stack.ll.add(4);
        stack.ll.add(2);

        stack.nextsmallerLL();
    }
}
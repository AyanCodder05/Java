
import java.util.Stack;
public class Stack2{
    public void nextsmaller(int arr[]){
        int n = arr.length;
        int[] result = new int[n];
       Stack<Integer> st = new Stack<>();
        for (int idx =n-1; idx >=0; idx--) {
            int current_ele=arr[idx];
            while(!st.isEmpty() && arr[st.peek()] >= current_ele){
                st.pop();
            }

            if(st.isEmpty()){
                result[idx]=-1;
            }
            else{
                result[idx]=arr[st.peek()];
            }
            st.push(idx);
            
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
            
        }

    }

    public static void main(String[] args) {

         int[] arr ={4, 5, 2, 10, 8};

        Stack2 stack=new  Stack2();
        stack.nextsmaller(arr);
        
    }
}
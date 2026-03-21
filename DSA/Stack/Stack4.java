
import java.util.Stack;

public class Stack4{
    public void dailyTemp(int arr[]){
        int n=arr.length;
        int [] result = new int[n];
        Stack <Integer> st=new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            int curr_temp=arr[i];
            while(!st.isEmpty() && arr[st.peek()] <=curr_temp){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=0;
            }

            else{
                result[i]=st.peek()-i;
            }
            st.push(i);
        }

        for (int x : result) {
            System.out.print(x+ " ");
        }

    }
    public static void main(String[] args) {

        Stack4 stack=new Stack4();
        int arr[]={73,74,75,71,69,72,76,73};
        stack.dailyTemp(arr);
        
    }
}
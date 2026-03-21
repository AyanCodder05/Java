import java.util.Stack;

public class Stack1 {

    public void previousSmaller(int arr[]) {

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int idx = 0; idx < n; idx++) {

            int current_ele = arr[idx];

            while (!st.isEmpty() && arr[st.peek()] >= current_ele) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[idx] = -1;
            } else {
                result[idx] = arr[st.peek()];
            }

            st.push(idx);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 6, 2, 3};

        Stack1 stack = new Stack1();
        stack.previousSmaller(arr);
    }
}
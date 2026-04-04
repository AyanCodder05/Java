import java.util.*;

public class Day2{
    public static void main(String[] args) {
        //Q1. Two Pointer Bug:

        /* Question
        int[] arr = {1,2,3,4,5};
        int left = 0, right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right++;   // bug
        }

        --------Interview-Level Answer (2 lines)--------

            The bug is incrementing right instead of decrementing, which breaks the two-pointer logic and can cause an infinite loop or wrong swapping.
            Fix: replace right++ with right-- to correctly move pointers toward each other.

        */
        int[] arr = {1,2,3,4,5};
        int left = 0, right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;   // correct
            
        }

        // for (int idx = 0; idx < arr.length; idx++) {
        //     System.out.println(arr[idx]);
            
        // }
       


       /*Q2. String Comparison Bug:
       String a = new String("hello");
       String b = new String("hello");
       
       if(a == b){
           System.out.println("Equal");
       }

      ---------- Interview-Level Answer ------------
        The bug is using == which compares object references instead of values, so two different String objects are not equal.
        Fix: use .equals() to compare the actual string values.


        ----------Key Concept (important)------------
            == → compares memory reference
            .equals() → compares content/value
       */
        String a = new String("hello");
        String b = new String("hello");

        if(a.equals(b)){
            System.out.println("Equal");
        }






        /*
        Q6. HashMap Bug:
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(1, "C");

        System.out.println(map.size());

        -------- Interview-Level Answer ---------
            The bug is that HashMap does not allow duplicate keys, so inserting key 1 again replaces the previous value instead of adding a new entry.
            Fix: ensure unique keys or use a different data structure if duplicates are required.
        */

       Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map.size());
        
    }
}

import java.util.*;


public class Day1 {
    public static void main(String[] args) {

        //Q1 (Java – Array Reverse Bug)
        int[] arr = {1,2,3,4,5};

        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // System.out.println(Arrays.toString(arr));


        //Q2 (Java – Duplicate Detection Bug)
        int[] array = {1,2,3,2,5};

        Set<Integer> set = new HashSet<>();

        for(int num : array){
            if(set.contains(num)){
                 System.out.println("Duplicate found"+num);
        }
        set.add(num);
        }

        // System.out.println("No duplicate");


        //Q3 (Java – Stack Runtime Bug)
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        stack.pop();
        stack.pop();

        // System.out.println(stack.peek());
        

        //Q4 (Java – Binary Search Bug)

        int[] arr2 = {1,3,5,7,9};
        int target = 7;

        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = (low + high) / 2;

            if(arr2[mid] == target){
                System.out.println(mid);
                break;
            }

            if(arr2[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
}



// Q1 (Java – Array Reverse Bug)
/*
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i];
            arr[arr.length - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
*/

// Q2 (Java – Duplicate Detection Bug)
/*
int[] arr = {1,2,3,2,5};

Set<Integer> set = new HashSet<>();

for(int num : arr){
    if(set.contains(num)){
        System.out.println("Duplicate found");
    }
    set.add(num);
}

System.out.println("No duplicate");

Interview-Level Answer (2 lines)

The bug is that the program always prints "No duplicate" even after detecting duplicates 
because there is no control flow to stop or track the result.
Fix: use a flag or return/break after detecting a duplicate, and print based on that flag.

-----------------------


Minimal Fix Code
boolean found = false;

for(int num : arr){
    if(set.contains(num)){
        found = true;
        break;
    }
    set.add(num);
}

if(found)
    System.out.println("Duplicate found");
else
    System.out.println("No duplicate");
*/

//--------------------

//Q3 (Java – Stack Runtime Bug)
/*import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
    }
}

-------------------------------

Interview-Level Answer (2 lines)

The bug is calling peek() on an empty stack, which throws an EmptyStackException.
Fix: check stack.isEmpty() before calling peek().

-------------------------------

Minimal Fix
if(!stack.isEmpty()){
    System.out.println(stack.peek());
}
else{
    System.out.println("Stack is empty");
}
*/

//---------------------------
//Q4 (Java – Binary Search Bug)

/*
int[] arr2 = {1,3,5,7,9};
int target = 7;

int low = 0;
int high = arr.length - 1;

while(low < high){
    int mid = (low + high) / 2;

    if(arr[mid] == target){
        System.out.println(mid);
        break;
    }

    if(arr[mid] < target)
        low = mid + 1;
    else
        high = mid - 1;
}

---------------------------
Interview-Level Answer (2 lines)

The bug is the loop condition low < high, which skips checking the last element when low == high.
Fix: change it to while(low <= high) to ensure all elements are checked.

---------------------------
Minimal Fix
while(low <= high){
    int mid = (low + high) / 2;

    if(arr[mid] == target){
        System.out.println(mid);
        break;
    }

    if(arr[mid] < target)
        low = mid + 1;
    else
        high = mid - 1;
}
*/  



/*
Problem: Given an array, reverse it without using extra space.
Example
Input:  [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
*/

//Correct Code:
public class array2{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}



/* My Code:
public class array2{
    public static void main(String[] args) {
        int array[]={1, 2, 3, 4, 5};

        int n=array.length;
        int [] arr=new int[n];
        int j=n;
        // int [] result = new int[n];
        
        for (int i =0; i<=n; i++) {

            arr[j-1]=array[i];
            j=j-1;

        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
*/
/*1. Find maximum and minimum element
Input: [3, 5, 1, 9]
Output: max = 9, min = 1*/

public class array1{
    public static void main(String[] args) {
        int array[]={3, 5, 1, 9};
        int max=array[0];
        int min=array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
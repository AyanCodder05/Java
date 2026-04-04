// Second Largest
public class Array3{
    public static void main(String[] args) {
        int arr[]={-10,-5,-20,8};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
           if(arr[i]>max){
            secondMax=max;
            max=arr[i];
           }

           else if(arr[i]<max && arr[i]>secondMax){
            secondMax=arr[i];
           }
        }
        System.out.println(secondMax);
            
        }
        
    }

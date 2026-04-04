// Check if array is sorted
public class Array6{
    public static void main(String[] args) {
        int arr[]={2,4,1,4,5};
        boolean issorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        System.out.println(issorted);
    }
}

/*I iterate through the array and compare each element with the next one.
If I find any pair where the current element is greater than the next,
the array is not sorted in ascending order.
If no such pair exists, the array is sorted.*/

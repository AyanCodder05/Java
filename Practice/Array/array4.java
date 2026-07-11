/*Find max / min
Reverse array (in-place)
Check sorted
Frequency count
*/
public class array4{
    public static void main(String[] args) {
        //Find max / min
        int arr[]={1,3,4,2,0,9};
        int max=arr[0];
        int min=arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(max<arr[i]){
                max=arr[i];
            }

            if(min>arr[i]){
                min =arr[i];
            }
            
            
        }

        // System.out.println("Maximum is "+max +" "+ "Minimum is "+min);

        // Reverse array (in-place)

        // int left=0, right=arr.length-1;

        // while(left<right){
        //     int temp=arr[left];
        //     arr[left]=arr[right];
        //     arr[right]=temp;

        //     left++;
        //     right--;

        // }

        // for (int i=0;i< arr.length;i++) {

        //     System.out.println("Reverse Array: "+arr[i]);
            
        // }


        //Check sorted
        boolean isSorted=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[i+1]){
                isSorted=false;
                break;  
            }
            
        }

        //System.out.println(isSorted);

        // Frequency count
        int num =2;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num) count++;
            
        }

        System.out.println("The number count is "+count);

    }
}
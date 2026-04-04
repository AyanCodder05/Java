// First Non-Repeating Element

public class Array7{
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 3, 2, 1, 3};

        int n=arr.length;
        int firstnonRepat=0;
        for (int i=0;i<n;i++){
            for (int j = i+1; j < n-2; j++) {
                if(arr[i]!=arr[j]) firstnonRepat=arr[i];
            }
        }
        System.out.println(firstnonRepat);
    }
}
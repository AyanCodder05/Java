public class Array{
    public static void main(String[] args) {
        // Two Sum

        int arr[]={2,7,8,9};
        int n= arr.length;
        int target=9;
        for(int i=0; i< n-2;i++){
            for (int j = i+1; j < n-1; j++) {
                if(arr[i] + arr[j]== target){
                    System.out.println("Found: "+target+" ="+" "+arr[i]+" + "+arr[j]);
                }
                else{
                    System.out.println("Not Found "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
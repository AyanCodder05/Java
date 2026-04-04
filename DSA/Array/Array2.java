public class  Array2{
    public static void main(String[] args) {
        int arr[]={20,10,5,40};
        int count=0;
        for(int i:arr){
            if(i%2==0){
                count++;
            }
            
        }
        System.out.println("Even: "+count);
        int odd=arr.length-count;
        System.out.println("odd: "+odd);
    }

}
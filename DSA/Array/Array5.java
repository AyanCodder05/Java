// Count positive & negative
public class Array5{
    public static void main(String[] args) {
        int arr[]={-2,-1,0,1,2,3,-3,0,9,-16};
        int pos=0;
        int neg=0;
        for (int i : arr) {
            if (i>0) {
                pos++;
            }
            else if(i<0){
                neg++;
            }
            
        }
        System.out.println("Total Positive: "+pos);
        System.out.println("Total Negative: "+neg);
    }
}
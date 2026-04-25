public class LinearSearch{
    public static void main(String[] args) {

        //Search in 2d Array:
            int [][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56}
            };


        
    }

    public int ls(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int ele=arr[i];

            if(ele==target){
                return i;
            }
            
        }

        return -1;
    }


//String Search:

    boolean search(String str, char target){

        if(str.length()==0){
            return false;
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if(target==str.charAt(i)){
        //         return true;
        //     }           
        // }

        for (char elem : str.toCharArray()) {
            if(elem==target){
                return true;
            }
        }
        return false;

    }

    // Question: arr=[18,12,-7,3,14,28]
    // search for 3 in the range of index [1,4]
    public int  arraySearch(int arr[], int target, int start, int last){
       if(arr.length==0){
            return -1;
        }
        for (int i = start; i <=last; i++) {
            int ele=arr[i];

            if(ele==target){
                return i;
            }
            
        }

        return -1;
    }

    //Question 3: Minimum number
    public int min(int arr[]){
        int minimum =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(minimum>arr[i]){
                minimum=arr[i];
            }
        }
        return minimum;
    }

   
    public int[] searchTwoD(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){return new int[]{row,col};}
            }
        }
        return new int[]{-1,-1};
    }

     public int maxTwoD(int [][]arr){
        int max= Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]> max){
                        max=arr[row][col];
                    }
                }
            }
            return max;
        }


    // Leetcode: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    boolean even(int num){
        int numOfDigits=digits(num);
        return numOfDigits %2==0;
    }
    int digit(int num){
        if(num<0){
            num= num * -1;
        }

        return (int)(Math.log10(num))+1;

    }
    int digits(int num){
        if(num<0){
            num= num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count=0;
        while(num > 0){
            count ++;
            num=num/10;
        }
        return count;
    }

    //Leetcode: https://leetcode.com/problems/richest-customer-wealth/submissions/1987996319/
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int row=0; row<accounts.length; row++){
            int currWealth=0;
            for(int col = 0; col < accounts[row].length; col++){
                currWealth+=accounts[row][col];
            }
            if(currWealth>maxWealth){
                maxWealth=currWealth;
            }

        }
        return maxWealth;
    }
        
}

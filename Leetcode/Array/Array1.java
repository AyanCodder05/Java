/*Leetcode: https://leetcode.com/problems/build-array-from-permutation/submissions/1988033624/
Question: 1920. Build Array from Permutation
*/


import java.util.Arrays;

class Array1{
    public static void main(String[] args) {
        int nums[]={0,2,1,5,3,4};
        Array1 obj = new Array1();
        System.out.println(Arrays.toString(obj.buildArray(nums)));

    }
    public int[] buildArray(int[] nums) {

        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            ans[i]=nums[nums[i]];
            
        }
        return ans;
        
    }
}
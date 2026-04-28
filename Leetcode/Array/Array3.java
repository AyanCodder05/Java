/*
1480. Running Sum of 1d Array
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Leetcode: https://leetcode.com/problems/running-sum-of-1d-array/description/
*/
class Array3{
    public int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
}
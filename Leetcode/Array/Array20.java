/*
1004. Max Consecutive Ones III

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Leetcode: https://leetcode.com/problems/max-consecutive-ones-iii/description/
*/
class Array20{
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zero_count=0, max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                zero_count++;
            }
            while(zero_count>k){
                if(nums[left]==0){
                    zero_count--;
                }
                left++;
            }
            max=Math.max(max, i-left+1);
        }
        return max;
    }
}
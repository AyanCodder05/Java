/*
209. Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target, 
return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 
Leetcode: https://leetcode.com/problems/minimum-size-subarray-sum/description/

*/
class Array19{
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min, i-left+1);  //minLength = minimum(minLength, current window length)
                sum-=nums[left];
                left++;
            }
            
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}

/*
Another Solution:
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int ans = n + 2; // Acts as "infinity" since max possible length is n
        
        for (int i = 0, left = 0; i < n; i++) {
            sum += nums[i];
            
            // Shrink the window from the left as much as possible
            while (sum >= target) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }
        
        return ans == n + 2 ? 0 : ans;
    }
}
*/
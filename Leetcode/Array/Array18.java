/*
643. Maximum Average Subarray I
Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000

Leetcode: https://leetcode.com/problems/maximum-average-subarray-i/
*/
class Array18{
    public double findMaxAverage(int[] nums, int k) {
    int sum=0;
    for (int i = 0; i < k; i++) {
       sum+=nums[i]; 
    }
    int max=sum;
    for (int i = k; i < nums.length; i++) {
        sum=sum-nums[i-k]+nums[i];
        max=Math.max(max, sum);
    }
    // return (double) max/4;//Error 
    return (double) max/k;
    }
}

/*
Another Solution:
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (double) maxSum / k;
    }
}
*/

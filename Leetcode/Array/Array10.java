/*
724. Find Pivot Index
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal 
to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

Leetcode: https://leetcode.com/problems/find-pivot-index/description/
*/
class Solution {
    public int pivotIndex(int[] nums) {
        // Step 1: calculate total sum
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        // Step 2: initialize left sum
        int left_sum = 0;

        // Step 3: iterate and check pivot
        for (int i = 0; i < nums.length; i++) {

            // right sum derived from total
            int right_sum = total - left_sum - nums[i];

            // check pivot condition
            if (left_sum == right_sum) {
                return i;
            }

            // update left sum for next index
            left_sum += nums[i];
        }

        return -1;
    }
}

import java.util.HashSet;

/*
219. Contains Duplicate II

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

class Practice2_219{
    public boolean containsNearbyDuplicate(int[] nums, int k){
        int left =0;
        HashSet <Integer> set=new HashSet<>();
        for(int right=0; right<nums.length;right++){
            while(right-left>k){
                set.remove(nums[left]);
                left++;
            }
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);
        }
        return false;
    }
}
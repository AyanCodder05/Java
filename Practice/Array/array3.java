/*
Problem: Given an array and a target, return indices of two numbers such that they add up to the target.
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]   // because 2 + 7 = 9
*/


public class array3{
    public static void main(String[] args) {
        int nums[]={2, 7, 11, 15};
        int n= nums.length;
        int target=9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < n-1; j++) {

                if(nums[i]+nums[j]==target){
                    System.out.println(i+ " "+j);
                }
                
            }
        
        }
    }
}

/*
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // fallback
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
*/
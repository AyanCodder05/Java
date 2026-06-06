
import java.util.HashSet;

/*
349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/
class Hashmap5_349{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }   
        for (int i = 0; i < nums2.length; i++) {
            if(set1.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }

        int [] arr=new int[result.size()];
        int index = 0;

        for(int num : result){
            arr[index] = num;
            index++;
        }

        return arr;
    }
}

/*
Another SOlution:
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] visited = new int[1001];
        for (int num : nums1)
            visited[num] = 1;

        int[] temp = new int[1001];
        int size = 0;
        for (int num2 : nums2) {
            if (visited[num2] == 1) {
                temp[size++] = num2;
                visited[num2] = 2;
            }
        }
        return Arrays.copyOf(temp, size);
    }
}
*/

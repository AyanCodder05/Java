

import java.util.HashSet;

// Intersection of two array
class array7{
    public int[] intersection(int [] nums1, int []nums2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();

        for(int nums: nums1){
            set1.add(nums);
        }

        for(int i=0; i<nums2.length;i++){
            if(result.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }

        int arr[] = new int[result.size()];
        int index=0;
        for (int nums:result) {
            arr[index]=nums;
            index++;
        }

        return arr;

    }
}
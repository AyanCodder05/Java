// Find the middle Index in Array

class array10_1991{
    public int miidleIndex(int [] nums){
        int total=0;
        for(int i: nums){
            total+=i;
        }

        int left_sum=0;
        for (int i = 0; i < nums.length; i++) {
            int right_sum= total-left_sum-nums[i];
            if(left_sum==right_sum) return i;
            left_sum+=nums[i];
        }
        return -1;
    }
}
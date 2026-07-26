// Move zeroes:
class array12_283{
    public void moveZeroes(int [] nums){
        int slow=0;
        int fast=0;
        while(fast<nums.length){
            if(nums[fast]==0) fast++;

            else{
                int temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;

                slow++;
                fast++;
            }
        }
        
    }
}
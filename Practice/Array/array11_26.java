// Contains Duplicate

class array11_26 {

    public int duplicate(int nums[]) {
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] == nums[fast]) {
                fast++;
            }

            else {
                slow++;
                nums[slow] = nums[fast];
                fast++;

            }
            
        }
        return slow + 1;
    }
}

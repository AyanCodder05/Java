// 977. Squares of a Sorted Array
class array13_977{
    public int [] squares(int nums[]){
        int answer[]=new int[nums.length];
        int left=0;
        int right=nums.length;
        int index=nums.length;

        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                answer[index]=nums[left]*nums[left];
                left++;
            }
            else{
                answer[index]=nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return answer;
    }
}
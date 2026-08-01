//  Maximum Average Subarray
class array17_643{
    public double  MaximuAvg(int nums[], int k){
        int windowSum=0;
        for(int i=0; i<k; i++){
            windowSum+=nums[i];
        }

        int maxSum=windowSum;
        for(int i=k;i<nums.length;i++){
            windowSum=windowSum-nums[i-k]+nums[i];
            maxSum=Math.max(maxSum, windowSum);
        }
        return (double)maxSum/4;
    }
}
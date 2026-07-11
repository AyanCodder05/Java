class Array{
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0]=10;

        int sum=0;

        // for (int i = 0; i < array.length; i++) {
        //     sum+=array[i];
        // }
        // System.out.println(sum);

        // for (int i : array) {
        //     System.out.println(array[i]);
        // }


        int nums[]={2,11,3,5,7};
        int target =9;
        for (int i= 0; i < nums.length; i++) {
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
            
    }
}

/*
nums =[] target=9 true nums[0], nums[4]
for(i=0; i<nums.length;i++){

for(j=0; j<nums.length; j++){

}
}

*/


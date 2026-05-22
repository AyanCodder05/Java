
import java.util.HashSet;
class Hashmap1{
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set= new HashSet<>();
        for (int i:nums) {
            if(set.contains(nums)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}


/*
class Hashmap1{
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

}
*/


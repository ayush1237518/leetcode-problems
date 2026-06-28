class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minnums = nums[0];
        int maxnums = nums[0];
        int x = k;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < minnums){
                minnums = nums[i];
            }
            if(nums[i] > maxnums){
                maxnums = nums[i];
            }
        }
       int diff = maxnums - minnums;
       if(diff <= 2*k){
        return 0;
       }
       return diff - 2*k;
    }
}
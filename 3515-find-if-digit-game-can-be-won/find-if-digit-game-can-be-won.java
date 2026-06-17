class Solution {
    public boolean canAliceWin(int[] nums) {
        int one = 0;
        int two = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 10) one += nums[i];
            else two += nums[i];
        }
        return one > two || two > one;
    }
}
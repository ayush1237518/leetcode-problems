class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for(int x = 0; x < k; x++) {
            for(int y = 0; y < k; y++) {
                if(x == y) continue;
                int op = 0;
                for(int i = 0; i < nums.length; i++) {
                    int need;
                    if(i % 2 == 0)need = x;
                    else need = y;
                    int rem = nums[i] % k;
                    int diff = Math.abs(rem - need);
                    op += Math.min(diff, k - diff);
                }
                ans = Math.min(ans, op);
            }
        }
        return ans;
    }
}
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                sums.add(sum);
            }
        }
        Collections.sort(sums);
        long ans = 0;
        long mod = 1000000007;
        for (int i = left - 1; i < right; i++) {
            ans += sums.get(i);
        }
        return (int) (ans % mod);
    }
}
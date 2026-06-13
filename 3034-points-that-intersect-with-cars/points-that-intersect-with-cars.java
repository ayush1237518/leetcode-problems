class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] points = new boolean[101];
        for(int i = 0; i < nums.size(); i++) {
            int start = nums.get(i).get(0);
            int end = nums.get(i).get(1);

            for(int j = start; j <= end; j++) {
                points[j] = true;
            }
        }
        int count = 0;
        for(int i = 1; i <= 100; i++) {
            if(points[i]) {
                count++;
            }
        }
        return count;
    }
}
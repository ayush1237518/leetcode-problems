class Solution {
    public String[] findRelativeRanks(int[] score) {
        int a = score.length;
        String [] ans = new String[a];
        for(int i=0;i<score.length;i++){
            int rank = 1;
            for(int j=0;j<score.length;j++){
                if(score[j]>score[i]){
                    rank++;
                }
            }
            if(rank == 1){
                ans[i] = "Gold Medal";
            }else if(rank == 2){
                ans[i] = "Silver Medal";
            }else if(rank == 3){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = String.valueOf(rank);
            }
        }
        return ans;
    }
}
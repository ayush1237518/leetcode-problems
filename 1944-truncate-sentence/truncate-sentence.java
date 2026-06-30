class Solution {
    public String truncateSentence(String s, int k) {
        String [] word = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(word[i]);
            if(i!=k-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
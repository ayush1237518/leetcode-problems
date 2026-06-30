class Solution {
    public String truncateSentence(String s, int k) {
        int SpaceCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                SpaceCount++;
                if(SpaceCount == k){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}
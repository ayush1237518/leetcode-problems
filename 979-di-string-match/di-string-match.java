class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int perm[] = new int[n+1];
        int low = 0;
        int high = n;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'I'){
                perm[i] = low;
                low++;
            }
            if(s.charAt(i)=='D'){
                perm[i] = high;
                high--;
            }
            perm[n] = low;
        }
        return perm;
    }
}
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int i=0;
        while(i<arr.length){
            boolean isfound = false;
            for(int j=0;j<pieces.length;j++){
                if(arr[i] == pieces[j][0]){
                    isfound = true;
    
                for(int k=0;k<pieces[j].length;k++){
                    if(arr[i+k] != pieces[j][k]){
                        return false;
                    }
                }
                i += pieces[j].length;
                break;
            }
        }
            if(!isfound){
                return false;
            }
        }
        return true;
    }
}
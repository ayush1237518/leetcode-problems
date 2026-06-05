class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        boolean flag = false;
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<m ; j++){
                if(arr[i][j]==target){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
class Solution {
    public int minimumSum(int num) {
        int n = 4;
        int sum = 0;
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        int new1 = arr[0]*10 + arr[2];
        int new2 = arr[1]*10 + arr[3];
        sum = new1+new2;
        return sum;
    }
}
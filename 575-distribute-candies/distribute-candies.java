class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> a = new HashSet<>();
        for(int candy : candyType){
            a.add(candy);
        }
        return Math.min(a.size(), n / 2);
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> n = new HashSet<>();
        for(int candy : candyType){
            n.add(candy);
        }
        return Math.min(n.size(), candyType.length / 2);
    }
}
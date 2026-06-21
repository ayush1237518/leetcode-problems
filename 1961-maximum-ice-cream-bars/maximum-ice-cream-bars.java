class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for (int cost : costs) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        int[] freq = new int[maxCost + 1];
        for (int cost : costs) {
            freq[cost]++;
        }
        int count = 0;
        for (int price = 1; price <= maxCost; price++) {
            if (freq[price] > 0) {
                int canBuy = Math.min(freq[price], coins / price);
                count += canBuy;
                coins -= canBuy * price;
                if (coins < price) {
                    break;
                }
            }
        }
        return count;
    }
}

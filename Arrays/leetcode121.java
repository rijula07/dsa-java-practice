// Problem: LeetCode 121 - Best Time to Buy and Sell Stock
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int mp = 0;
        for (int i=1;i<prices.length;i++) {
            int p=prices[i]-b;
            mp = Math.max(p,mp);
                    if (prices[i]<b) {
                        b= prices[i];
                    }
        }
        return mp;
    }
}

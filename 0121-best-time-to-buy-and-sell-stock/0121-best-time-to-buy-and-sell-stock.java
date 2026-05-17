class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minp=prices[0];
        int maxp=0;
        for(int i=0; i<n;i++){
            int currp=prices[i]-minp;
            minp=Math.min(prices[i], minp);
            maxp=Math.max(maxp, currp);
        }
        return maxp;
    }
}
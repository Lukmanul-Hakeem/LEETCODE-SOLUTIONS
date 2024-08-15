class Solution {
    public int maxProfit(int[] prices) {
        int maxval=prices[prices.length-1];
        int maxprofit=0;
        int profit=0;
        int i=prices.length-2;
        while(i>=0){
            maxval=maxval>prices[i]?maxval:prices[i];
            profit=maxval-prices[i];
            maxprofit=maxprofit>profit?maxprofit:profit;
            i--;
        }
        return maxprofit;
    }
}
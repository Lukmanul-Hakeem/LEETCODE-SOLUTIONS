class Solution {
    //public void findMaxProfit(int prices[],int dp[],)
    public int maxProfit(int[] prices) {
        int dp[]=new int[prices.length];
        for(int i=0;i<prices.length;i++)dp[i]=0;
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j] && prices[j] - prices[i] > dp[j]){
                    dp[j]=prices[j] - prices[i];
                    max = max > dp[j] ? max : dp[j];
                }else break;
            }
        }

        return max;

    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;

        for(int val : prices){
            if(val < min)min=val;
            else ans = ans > val - min ? ans : val - min;
        }

        return ans;

    }
}
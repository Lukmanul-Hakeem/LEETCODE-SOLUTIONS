class Solution {
    public int findCount(int coins[],int index,int target,int dp[][]){
        if(index == coins.length)return 0;
        if(target == 0)return 1;
        if(dp[index][target] != -1)return dp[index][target];

        int count = 0;
        count += findCount(coins,index + 1,target,dp);
        if(coins[index] <= target)count += findCount(coins,index,target - coins[index],dp);

        return dp[index][target] = count;
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount + 1];
        for(int i=0;i<coins.length;i++)Arrays.fill(dp[i],-1);
        return findCount(coins,0,amount,dp);
    }
}
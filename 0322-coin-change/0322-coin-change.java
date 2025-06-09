class Solution {
    public int find(int coins[],int index,int target,int dp[][]){
        if(target == 0)return 0;
        if(index == coins.length)return 1000_000_0;
        if(dp[index][target] != -1)return dp[index][target];

        int  notPick = Integer.MAX_VALUE;
        int pick = Integer.MAX_VALUE;

        notPick = find(coins,index+1,target,dp);
        int i =1;
        while(coins[index]*i <= target){
            //System.out.println(target - coins[index]*i);
            pick = Math.min(pick,i + find(coins,index+1,target - coins[index]*i,dp));
            i++;
        }

        return dp[index][target] = Math.min(notPick,pick);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)return 0;
        int dp[][] = new int [coins.length][amount + 1];
        for(int i =0;i<coins.length;i++)Arrays.fill(dp[i],-1);
        find(coins,0,amount,dp);
        // for(int arr[] : dp){
        //     for(int val : arr)System.out.print(val+" ");
        //     System.out.println();
        // }

        return dp[0][amount] == 1000_000_0 ? -1 : dp[0][amount];
    }
}
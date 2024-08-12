class Solution {
    public int find(int dp[],int n){
        if(dp[n]!=0)return dp[n];
        for(int i=1;i<=n;i++)dp[n]+=find(dp,i-1)*find(dp,n-i);
        return dp[n];
    }
    public int numTrees(int n) {
       int dp[]=new int[n+1];
       dp[0]=dp[1]=1;
       for(int i=1;i<=n;i++)find(dp,i);
       return dp[n]; 
    }
}
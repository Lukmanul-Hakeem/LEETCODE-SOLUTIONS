class Solution {
    public int findnumberofones(int dp[],int i){
        if(i==0)return 0;
        if(dp[i]!=0)return dp[i];
        dp[i]=(i&1)==1?findnumberofones(dp,i>>1)+1:findnumberofones(dp,i>>1);
        return dp[i];

    }
    public int[] countBits(int n) {
        int dp[]=new int [n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            findnumberofones(dp,i);
        }
        return dp;
    }
}
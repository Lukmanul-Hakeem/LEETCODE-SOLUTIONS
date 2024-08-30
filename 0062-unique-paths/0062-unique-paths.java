class Solution {
    public int find(int dp[][],int i,int j){
        if(i==dp.length || j==dp[0].length)return 0;
        if(i==dp.length-1 && j==dp[0].length-1)return 1;
        if(dp[i][j]!=0)return dp[i][j];
        dp[i][j]=find(dp,i,j+1)+find(dp,i+1,j);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [m][n];
        return find(dp,0,0);
        //return dp[0][0];
    }
}
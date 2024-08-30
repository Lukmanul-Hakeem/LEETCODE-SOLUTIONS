class Solution {
    public int find(int Grid[][],int dp[][],int i,int j){
        if(i==dp.length || j==dp[0].length)return 0;
        if(Grid[i][j]==1)return 0;
        if(i==dp.length-1 && j==dp[0].length-1)return 1;
        if(dp[i][j]!=0)return dp[i][j];
        dp[i][j]=find(Grid,dp,i,j+1)+find(Grid,dp,i+1,j);
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] Grid) {
        int dp[][]=new int[Grid.length][Grid[0].length];
        return find(Grid,dp,0,0);
    }
}
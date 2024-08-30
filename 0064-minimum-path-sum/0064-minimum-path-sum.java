class Solution {
    public int find(int grid[][],int dp[][],int i,int j){
        if(i>=dp.length || j>=dp[0].length)return Integer.MAX_VALUE;
        if(i==dp.length-1 && j==dp[0].length-1){
            dp[i][j]=grid[i][j];
            return grid[i][j];
        }

        if(dp[i][j]!=0)return dp[i][j];

        int right=find(grid,dp,i,j+1);
        int down=find(grid,dp,i+1,j);

        dp[i][j]=grid[i][j] + Math.min(right,down);

        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int dp[][]=new int [grid.length][grid[0].length];

        return find(grid,dp,0,0);

    }
}
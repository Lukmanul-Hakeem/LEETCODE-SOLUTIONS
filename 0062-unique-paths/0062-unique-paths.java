class Solution {
    public int findCount(int dp[][],int m,int n,int row,int col){
        if(row == m || col == n || row == -1 || col == -1)return 0;
        if(row == m - 1 && col == n - 1)return 1;
        if(dp[row][col] != -1)return dp[row][col];
        int down  = findCount(dp,m,n,row + 1,col);
        int right = findCount(dp,m,n,row,col + 1);
        dp[row][col] = down + right;
        return dp[row][col];
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return findCount(dp,m,n,0,0);
        // for(int arr[] : dp){
        //     for(int val1 : arr)System.out.print(val1+" ");
        //     System.out.println();
        // }

        // return val;
    }
}
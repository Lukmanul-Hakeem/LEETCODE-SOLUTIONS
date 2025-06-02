class Solution {
    // public int findCount(int dp[][],int m,int n,int row,int col){
    //     if(row == m || col == n || row == -1 || col == -1)return 0;
    //     if(row == m - 1 && col == n - 1)return 1;
    //     if(dp[row][col] != -1)return dp[row][col];
    //     int down  = findCount(dp,m,n,row + 1,col);
    //     int right = findCount(dp,m,n,row,col + 1);
    //     dp[row][col] = down + right;
    //     return dp[row][col];
    // }
    public int findCount(int path[][],int m,int n,int row,int col,int dp[][]){
        if(row == m || col == n || row == -1 || col == -1 || path[row][col] == 1)return 0;
        if(row == m - 1 && col == n - 1)return 1;
        if(dp[row][col] != -1)return dp[row][col];
        int down  = findCount(path,m,n,row + 1,col,dp);
        int right = findCount(path,m,n,row,col + 1,dp);
        dp[row][col] = down + right;
        return dp[row][col];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1 || obstacleGrid[0][0] == 1)return 0;
        // for(int i=0;i<obstacleGrid.length;i++){
        //     for(int j=0;j<obstacleGrid[0].length;j++){
        //         if(obstacleGrid[i][j] == 1)obstacleGrid[i][j] = -1;
        //         else obstacleGrid[i][j] = 1;
        //     }
        // }
        // int up = 0;
        // int left = 0;
        // for(int i=0;i<obstacleGrid.length;i++){
        //     for(int j=0;j<obstacleGrid[0].length;j++){
        //         up = 0;
        //         left = 0;
        //         if(i-1 >= 0 && j-1 >= 0 && (i != 0 && j != 0) && obstacleGrid[i][j] != -1 ){
        //             if((obstacleGrid[i][j-1] == -1)){
        //                 up = obstacleGrid[i-1][j];
        //             }else if(obstacleGrid[i-1][j] == -1){
        //                 left = obstacleGrid[i][j-1];
        //             }else{
        //                 up = obstacleGrid[i-1][j];
        //                 left = obstacleGrid[i][j-1];
        //             }

        //             // System.out.println("index: i="+i+", j="+j+" left+up = "+(left+up));
                    
        //             obstacleGrid[i][j] = up + left;
        //         }
        //     }
        // }

        // for(int arr[] : obstacleGrid){
        //     for(int val : arr)System.out.print(val+" ");
        //     System.out.println();
        // }

        // return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++)Arrays.fill(dp[i],-1);
        return findCount(obstacleGrid,obstacleGrid.length,obstacleGrid[0].length,0,0,dp);
    }
}
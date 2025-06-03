class Solution {

    public int findmin(int matrix[][],int row,int col,int dp[][]){
        if (row == matrix.length - 1) return matrix[row][col];
        if(dp[row][col] != -1)return dp[row][col];
        int leftD = Integer.MAX_VALUE;
        int rightD = Integer.MAX_VALUE;
        int striagthB = Integer.MAX_VALUE;
        if(col != 0) leftD = findmin(matrix,row+1,col-1,dp);
        if(col != matrix.length-1)rightD = findmin(matrix,row+1,col+1,dp);
        striagthB = findmin(matrix,row+1,col,dp);
        
        dp[row][col] = matrix[row][col] + Math.min(Math.min(leftD,striagthB),rightD);
        
        return dp[row][col];
    }
    public int minFallingPathSum(int[][] matrix) {

        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)Arrays.fill(dp[i],-1);

        // for(int i=0;i<matrix.length;i++) dp[0][i] = matrix[0][i];
        // int min = Integer.MAX_VALUE;
        // for(int i=1;i<matrix.length;i++){
        //     for(int j=0;j<matrix.length;j++){
        //         if(j == 0){
        //             dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
        //         }else if(j == matrix.length -1){
        //             dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j-1]);
        //         }else{
        //             dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
        //         }

        //         // if( i == matrix.length-1) min = Math.min(min,dp[i][j]);
        //     }
        // }

        // for(int i=0;i<matrix.length;i++)min = Math.min(min, dp[matrix.length-1][i]);

        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)min = Math.min(min,findmin(matrix,0,i,dp));

        return min;
    }
}
class Solution {
    public int minSum(List<List<Integer>> triangle,int row,int col,int dp[][]){

        if(row == triangle.size())return 0;
        if(dp[row][col] != -1)return dp[row][col];

        List<Integer> list = triangle.get(row);

        int temp1 = minSum(triangle,row+1,col,dp);
        int temp2 = minSum(triangle,row+1,col+1,dp);
        
        return dp[row][col] = list.get(col) + Math.min(temp1,temp2);
        
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int [triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int i = 0;i <dp.length;i++)Arrays.fill(dp[i],-1);
        return minSum(triangle,0,0,dp);
    }   
}
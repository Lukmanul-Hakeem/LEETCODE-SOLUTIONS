class Solution {

    public int findFish(int A[][],int row,int col,int visited[][]){
        if(row < 0 || col < 0 || row >= A.length || col >= A[0].length || A[row][col]==0 || visited[row][col]==1)return 0;
        visited[row][col]=1;
        return A[row][col] + findFish(A,row+1,col,visited) + findFish(A,row-1,col,visited) + findFish(A,row,col+1,visited) + findFish(A,row,col-1,visited);

    }
    public int findMaxFish(int[][] grid) {
        int visited[][]=new int [grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)visited[i][j]=0;
        }

        int max=0;
        int val=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==0 && grid[i][j]!=0){
                    val=findFish(grid,i,j,visited);
                    max = max < val ? val : max;
                }
            }
        }

        return max;
        
    }
}
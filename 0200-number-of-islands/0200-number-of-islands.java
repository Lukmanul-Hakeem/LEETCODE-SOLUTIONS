class Solution {
    public void findCount(char [][]grid,int row,int col){
        if(col==grid[0].length || row==grid.length || col==-1 || row==-1 || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        findCount(grid,row,col+1);
        findCount(grid,row+1,col);
        findCount(grid,row,col-1);
        findCount(grid,row-1,col);
        
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    findCount(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
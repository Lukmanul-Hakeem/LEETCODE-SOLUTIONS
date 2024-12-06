class Solution {
    public boolean find(char[][] A,String word,int index,int row,int col,boolean visited[][]){
        if(row<0 || row>A.length-1 || col<0 || col>A[0].length-1 || A[row][col]!=word.charAt(index) || visited[row][col])return false;
        if(index==word.length()-1)return true;
        visited[row][col]=true;
        if(
            find(A,word,index+1,row+1,col,visited) ||
            find(A,word,index+1,row,col+1,visited) ||
            find(A,word,index+1,row-1,col,visited) ||
            find(A,word,index+1,row,col-1,visited) 
        )return true;
        visited[row][col]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean [board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++)visited[i][j]=false;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                    if(find(board,word,0,i,j,visited))return true;
            }
            
        }
        return false;
    }
}
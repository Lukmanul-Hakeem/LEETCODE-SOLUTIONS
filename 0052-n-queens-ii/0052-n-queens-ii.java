class Solution {
    public boolean caniplace(char str[][],int row,int col){
        int temprow=row;
        int tempcol=col;

        while(temprow>=0){
            if(str[temprow][tempcol]=='Q')return false;
            temprow--;
        }
        temprow=row;

        //maindiagonal

        while(temprow>=0 && tempcol>=0){
            if(str[temprow][tempcol]=='Q')return false;
            
            temprow--;
            tempcol--;
        }

        temprow=row;
        tempcol=col;
        while(temprow>=0 && tempcol<str.length){
            if(str[temprow][tempcol]=='Q')return false;
            
            temprow--;
            tempcol++;
        }
        return true;
    }
    public void numberofways(char matrix[][],int count[],int row){
        if(row==matrix.length){
            count[0]++;
            return;
        }
        for(int i=0;i<matrix.length;i++){
            if(caniplace(matrix,row,i)){
                matrix[row][i]='Q';
                numberofways(matrix,count,row+1);
                matrix[row][i]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        char matrix[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]='.';
            }
        }
        int count[]=new int[1];
        numberofways(matrix,count,0);
        return count[0];
    }
}
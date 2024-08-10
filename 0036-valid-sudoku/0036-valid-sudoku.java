class Solution {
    public boolean isValid(char A[][],int row,int col,char ch){
        for(int i=0;i<A.length;i++){
            if((3*(row/3)+i/3)==row && (3*(col/3)+i%3)==col){
                continue;
            }
            if(A[3*(row/3)+i/3][3*(col/3)+i%3]==ch){
                return false;
            }
        }
        for(int i=0;i<A.length;i++){
            if(i==row){
                continue;
            }
            if(A[i][col]==ch){
                return false;
            }
        }

        for(int i=0;i<A.length;i++){
            if(i==col){
                continue;
            }
            if(A[row][i]==ch){
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] A) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]!='.'){
                    if(isValid(A,i,j,A[i][j])){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
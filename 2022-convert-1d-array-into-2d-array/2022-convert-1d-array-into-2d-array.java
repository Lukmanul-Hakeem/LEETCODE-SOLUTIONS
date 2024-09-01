class Solution {
    public int[][] construct2DArray(int[] A, int m, int n) {
        if(A.length!=(m*n)){
            //int empty[][]=new int[1][1];
            return new int[0][0];
        }
        int ans[][]=new int [m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=A[k];
                k++;
            }
        }
        return ans;
    }
}
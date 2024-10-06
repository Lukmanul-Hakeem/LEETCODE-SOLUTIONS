class Solution {
    public void DFS(int A[][],int start,int visited[]){
        if(visited[start]!=1){
            for(int i=0;i<A.length;i++){
                visited[start]=1;
                if(A[start-1][i]==1 && visited[i+1]!=1 && i!=(start-1)){
                    DFS(A,i+1,visited);
                }
            }
        }
    }

    public int numberOfProvince(int A[][]){
        int count=0;
        int visited[]=new int[A.length+1];
        for(int i=1;i<visited.length;i++){
            if(visited[i]!=1){
                count++;
                DFS(A,i,visited);
            }
        }
        return count;
    }

    public int findCircleNum(int[][] isConnected) {
       return numberOfProvince(isConnected); 
    }
}
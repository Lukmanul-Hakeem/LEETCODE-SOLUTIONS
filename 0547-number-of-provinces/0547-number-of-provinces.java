class Solution {

    public void DoDfs(int arr[][],int current,int visited[]){
        if(visited[current] == 1)return;
        visited[current] = 1;

        for(int i=0;i<arr.length;i++){
            if(arr[current][i] == 1){
                DoDfs(arr,i,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int visited[]= new int[isConnected.length];
        Arrays.fill(visited,-1);

        int count = 0;

        for(int i=0;i<isConnected.length;i++){
            
            if(visited[i] == -1){
                count++;
                DoDfs(isConnected,i,visited);
            }
        
        }

        return count;
    }
}
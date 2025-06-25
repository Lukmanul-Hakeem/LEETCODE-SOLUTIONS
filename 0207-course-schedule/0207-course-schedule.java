class Solution {
    public boolean detectCycle(ArrayList<ArrayList<Integer>>adj,int currNode,int visited[]){
        if(visited[currNode] == 1)return true;
        if(visited[currNode] == 2)return false;
        visited[currNode] = 1;
        
        for(int i=0;i<adj.get(currNode).size();i++){
            if(detectCycle(adj,adj.get(currNode).get(i),visited))return true;
        }
        visited[currNode] = 2;
        return false;
        
    }
    public boolean canFinish(int v, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<v;i++)adj.add(new ArrayList<>());
        
        for(int i=0;i<edges.length;i++)adj.get(edges[i][0]).add(edges[i][1]);
        
        
        int visited[] = new int[v];

        for (int i = 0; i < v; i++) {
            if (visited[i] == 0) {
                if (detectCycle(adj, i, visited)) return false; 
            }
        }
        
        return true;
    }
}
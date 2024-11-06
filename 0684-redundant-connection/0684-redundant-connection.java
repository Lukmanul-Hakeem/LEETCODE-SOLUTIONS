class Solution {
    public int findParent(int parent[],int child){
        if(parent[child]==child)return child;
        return parent[child]=findParent(parent,parent[child]);
    }
    public void unionof(int parent[],int rank[],int u,int v){
        int pu=findParent(parent,u);
        int pv=findParent(parent,v);
        if(rank[pu] > rank[pv])parent[pv]=pu;
        else if(rank[pu] < rank[pv])parent[pu]=pv;
        else{
            parent[pv]=pu;
            rank[pu]++;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int parent[]=new int [edges.length+1];
        int rank[]=new int [edges.length+1];

        for(int i=0;i<edges.length;i++){
            parent[i]=i;
            rank[i]=0;
        }
        int ans[]=new int[1];

        

        for(int i=0;i<edges.length;i++){
            int pu=findParent(parent,edges[i][0]);
            int pv=findParent(parent,edges[i][1]);
            if(pu!=pv){
                unionof(parent,rank,edges[i][0],edges[i][1]);
            }else return edges[i];
        }
        return ans ;
    }
}
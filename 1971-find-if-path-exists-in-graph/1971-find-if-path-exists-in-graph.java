class Solution {
    class Edge{
        int source;
        int dest;
        Edge(int source,int dest){
            this.source=source;
            this.dest=dest;
        }
    }
    public boolean findpath( ArrayList<Edge> graph[],int source,int dest,int visited[]){
        if(source==dest)return true;
        if(visited[source]==1)return false;
        boolean flag=false;
        visited[source]=1;
        for(int i=0;i<graph[source].size();i++){
            Edge e=graph[source].get(i);
            System.out.println(e.dest);
            flag=findpath(graph,e.dest,dest,visited);
            if(flag)return flag;
        }
        return flag;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Edge> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(new Edge(edges[i][0],edges[i][1]));
            graph[edges[i][1]].add(new Edge(edges[i][1],edges[i][0]));
        }
        int visited[]=new int[n];

        return findpath(graph,source,destination,visited);
    }
}
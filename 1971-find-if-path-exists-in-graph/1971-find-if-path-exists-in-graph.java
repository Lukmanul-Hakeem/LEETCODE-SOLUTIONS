class Solution {
    class node{
        int val;
        node next;
        node(int val,node next){
            this.val=val;
            this.next=next;
        } 
    }

    class graph{
        int vertices;
        node List[];

        graph(int vertices){
            this.vertices=vertices;
            List=new node[vertices];
        }
    }

    public void DFS(graph g,int source,int visited[]){
        if(visited[source]==1)return;
        visited[source]=1;
        node temp=g.List[source];
        while(temp!=null){
            DFS(g,temp.val,visited);
            temp=temp.next;
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        graph g=new graph(n);
        for(int i=0;i<edges.length;i++){
            if(g.List[edges[i][0]]==null)g.List[edges[i][0]]=new node(edges[i][1],null);
            else{
                node newnode=new node(edges[i][1],null);
                newnode.next=g.List[edges[i][0]];
                g.List[edges[i][0]]=newnode;
            }

            if(g.List[edges[i][1]]==null)g.List[edges[i][1]]=new node(edges[i][0],null);
            else{
                node newnode=new node(edges[i][0],null);
                newnode.next=g.List[edges[i][1]];
                g.List[edges[i][1]]=newnode;
            }

        }

        int visited[]=new int [n];
        for(int i=0;i<n;i++)visited[i]=0;

        DFS(g,source,visited);
        if(visited[destination]==1)return true;
        return false;
    }
}
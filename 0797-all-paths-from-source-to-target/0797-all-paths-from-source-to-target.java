class Solution {
    public void findAllPath(int graph[][],List<List<Integer>> mainList,List<Integer> list,int source,int dest){
        if(source==dest){
            if(!mainList.contains(list))mainList.add(new ArrayList(list));
            return;
        }

        for(int i=0;i<graph[source].length;i++){
            list.add(graph[source][i]);
            findAllPath(graph,mainList,list,graph[source][i],dest);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> mainList=new ArrayList<>();
        list.add(0);
        findAllPath(graph,mainList,list,0,graph.length-1);
        return mainList;
    }
}
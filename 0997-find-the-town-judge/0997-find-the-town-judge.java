class Solution {
    public int findJudge(int n, int[][] trust) {
        int outdegree[]=new int[n+1];
        int indegree[]=new int [n+1];
        for(int i=0;i<trust.length;i++){
            outdegree[trust[i][0]]++;
            indegree[trust[i][1]]++;
        }
        for(int i=1;i<outdegree.length;i++){
            if(outdegree[i]==0 && indegree[i]==n-1)return i;
        }
        return -1;
    }
}
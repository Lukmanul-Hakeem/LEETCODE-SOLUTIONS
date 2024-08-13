class Solution {
    public void findCombination(int n,int i,int k,int low,List<List<Integer>> listoflist,List<Integer> list){
        if(i==k){
            listoflist.add(new ArrayList<>(list));
            return;
        }
        for(int j=low;j<=n;j++){
            list.add(j);
            findCombination(n,i+1,k,j+1,listoflist,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> listoflist=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findCombination(n,0,k,1,listoflist,list);
        return listoflist;
    }
}
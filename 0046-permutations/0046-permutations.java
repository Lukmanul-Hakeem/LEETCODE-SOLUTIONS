class Solution {
    public void permutation(List<List<Integer>> listoflist,List<Integer> list,int A[],int index,boolean used[]){
        if(index==A.length){
            listoflist.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<A.length;i++){
            if(used[i])continue;
            used[i]=true;
            list.add(A[i]);
            permutation(listoflist,list,A,index+1,used);
            //permutation(listoflist,list,A,i+1,high,index+1);
            list.remove(list.size()-1);
            used[i]=false;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> listoflist=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean used[]=new boolean [nums.length];
        permutation(listoflist,list,nums,0,used);
        return listoflist;
    }
}
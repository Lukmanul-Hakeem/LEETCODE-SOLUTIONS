class Solution {
    public void permutation(int A[],List<List<Integer>> listoflist,List<Integer> list,boolean used[],int index){
        if(index==A.length){
            if(listoflist.contains(list))return;
            listoflist.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<A.length;i++){
            if(used[i])continue;
            used[i]=true;
            list.add(A[i]);
            permutation(A,listoflist,list,used,index+1);
            used[i]=false;
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> listoflist=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean used[]=new boolean [nums.length];
        permutation(nums,listoflist,list,used,0);
        return listoflist;
    }
}
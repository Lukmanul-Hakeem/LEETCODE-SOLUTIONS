class Solution {
    public void findCombinationSum(int A[],int low,int high,List<List<Integer>> listoflist,List<Integer> list,int sum,int target){
        //System.out.println("hello");
        if(sum==target){
            listoflist.add(new ArrayList<>(list));
            return;
        }
        //System.out.println("hello");

        if(sum>target)return;
        //System.out.println("hello");

        for(int i=low;i<=high;i++){
            //System.out.println("hello")
            if (i > low && A[i] == A[i - 1]) continue;
            list.add(A[i]);
            findCombinationSum(A,i+1,high,listoflist,list,sum+A[i],target);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> listoflist=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        findCombinationSum(candidates,0,candidates.length-1,listoflist,list,0,target);
        return listoflist;
    }
}
class Solution {
    public void find(List<List<Integer>> L,List<Integer> list,int nums[],int index){
        if(index==nums.length){
            //L.add(new ArrayList(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                L.add(new ArrayList(list));
                find(L,list,nums,i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> L=new ArrayList<>();
        L.add(new ArrayList(list));
        find(L,list,nums,0);
        return L;
    }
}
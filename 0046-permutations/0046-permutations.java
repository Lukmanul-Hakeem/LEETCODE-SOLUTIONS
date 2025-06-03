class Solution {
    public void find(int nums[],int index,List<List<Integer>> result,List<Integer> list){
        if(list.size() == nums.length){
            if(!result.contains(list)){
                result.add(new ArrayList(list));
            }
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                find(nums,i+1,result,list);
                list.remove(list.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        find(nums,0,result,list);
        return result;
    }
}
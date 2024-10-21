class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]-1 != i && nums[i]!=nums[nums[i]-1]){
                int x=nums[i];
                nums[i]=nums[x-1];
                nums[x-1]=x;
            }else i++;
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1 != j)list.add(j+1);
        }
        return list;
    }
}
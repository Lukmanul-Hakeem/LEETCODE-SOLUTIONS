class Solution {
    public int minimumOperations(int[] nums) {

        int map[] = new int[101];
        for(int i=0;i<nums.length;i++)map[nums[i]]=0;
        int index =-1;
        for(int i = nums.length-1;i>=0;i--){
            if(map[nums[i]]==1){
                index = i;
                break;
            }else map[nums[i]]++;
        }

        index++;
        return index == -1 ? 0 : (index%3 == 0 ? index/3 : index/3+1);

    }
}
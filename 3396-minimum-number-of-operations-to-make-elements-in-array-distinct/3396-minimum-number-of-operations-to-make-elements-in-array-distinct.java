class Solution {
    public int minimumOperations(int[] nums) {
        int map[] = new int[101];
        // for(int i=0;i<nums.length;i++)map[nums[i]]=0;
        for(int i = nums.length-1;i>=0;i--)
            if(map[nums[i]]==1)return (i+1)%3 == 0 ? (i+1)/3 : (i+1)/3+1;
            else map[nums[i]]++; 
        return 0;
    }
}
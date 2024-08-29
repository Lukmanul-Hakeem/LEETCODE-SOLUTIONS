class Solution {
    public boolean canJump(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max==0 && nums[i]==0 && i!=nums.length-1)return false;
            else{
                max=max-nums[i]>=0?max:nums[i];
                max--;
            }
        }
        return true;
    }
}
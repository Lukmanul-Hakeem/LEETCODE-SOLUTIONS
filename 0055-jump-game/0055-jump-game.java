class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)return true;
        int jump = 0;
        for(int i =0;i<nums.length;i++){
            if(jump == 0 && nums[i] == 0)return false;
            else{
                jump = jump > nums[i] ? jump : nums[i];
                if(jump + i >= nums.length-1 )return true;
            }
            jump--;
        }

        return true;

    }
}
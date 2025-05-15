class Solution {
    public boolean canJump(int[] nums) {
        int i = 0, max = 0,jump = 0;
        if(nums.length == 1)return true;
        while(i<nums.length){
            jump = i+nums[i];
            max = max > jump ? max : jump;
            if(max <= i && i != nums.length-1)return false;
            jump--;
            i++;
        }
        return true;
    }
}
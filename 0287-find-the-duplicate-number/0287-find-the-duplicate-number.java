class Solution {
    public int findDuplicate(int[] nums) {
        for(int val : nums){
            // System.out.println(val);
            if(nums[Math.abs(val) - 1] < 0)return Math.abs(val);
            else nums[Math.abs(val) - 1] = -nums[Math.abs(val) - 1];
        }

        return 0;
    }
}
class Solution {
    public Boolean find(int nums[],int target,int index,Boolean dp[][]){
        if(target == 0)return dp[index][target] = true;
        if(index == nums.length || target < 0)return false;

        if(dp[index][target] != null)return dp[index][target];

        Boolean pick = find(nums,target - nums[index],index + 1,dp);
        Boolean notPick = find(nums,target,index + 1,dp);

        return dp[index][target] = pick || notPick;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int val : nums)sum+=val;
        if(sum % 2 == 1)return false;

        int k = sum/2;
        Boolean dp[][] = new Boolean [nums.length+1][k+1];

        return find(nums,k,0,dp);

    }
}
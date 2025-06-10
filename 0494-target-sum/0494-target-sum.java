class Solution {
    public int count(int nums[],int index,int target,int dp[][]){
        // if(target == 0)return 1;
        if(index == nums.length){
            return target == 0 ? 1 : 0;
        }
        if(dp[index][target] != -1)return dp[index][target];
        int notPick = count(nums,index+1,target,dp);
        int pick = 0;
        if(nums[index] <= target)pick = count(nums,index+1,target - nums[index],dp);

        return dp[index][target] = notPick + pick;
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int val : nums)sum+=val;
        if((sum - target)%2 == 1 || (sum - target)<0 )return 0;
        System.out.println((sum - target)%2);

        int dp[][] = new int[nums.length][(sum - target)/2 + 1];
        for(int i=0;i<nums.length;i++)Arrays.fill(dp[i],-1);
        System.out.println((sum - target)/2);
        return count(nums,0,(sum - target)/2,dp);
    }
}
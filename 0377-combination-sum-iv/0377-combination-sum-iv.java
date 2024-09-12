class Solution {
    public int find(int nums[],int dp[],int target,int currentTarget){
        if(currentTarget<0)return 0;
        if(currentTarget==0)return 1;
        if(dp[currentTarget]!=-1)return dp[currentTarget];
        int sum=0;
        for(int val:nums)sum+=find(nums,dp,target,currentTarget-val);
        dp[currentTarget]=sum;
        return sum;
    }
    public int combinationSum4(int[] nums, int target) {
        int dp[]=new int[target+1];
        for(int i=0;i<dp.length;i++)dp[i]=-1;
        find(nums,dp,target,target);

        return dp[target];
    }
}
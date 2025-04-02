class Solution {
    public int findMinCount(int nums[],int dp[],int index){
        if(index == nums.length-1)return 0;
        if(dp[index]!=-1)return dp[index]+1;
        int min = Integer.MAX_VALUE-10000;
        int val = 0;
        for(int i=index+1;i<nums.length && i<=index+nums[index];i++){
            val = findMinCount(nums,dp,i);
            //System.out.println(nums[index]+" "+index+" "+val+" "+i);
            min = min < val ? min : val;
        }
        //System.out.println()
        dp[index]=min;
        return dp[index]+1;
    }
    public int jump(int[] nums) {
        int dp[] = new int [nums.length];
        for(int i = 0;i<nums.length;i++)dp[i]=-1;
        dp[0]=findMinCount(nums,dp,0);
        for(int i = 0;i<nums.length;i++)System.out.println(dp[i]);
        return dp[0];
    }
}
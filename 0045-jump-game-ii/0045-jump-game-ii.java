class Solution {
    public int findMin(int nums[],int dp[],int index,int maxInd){

        if(index >= nums.length -1)return 1;
        if(dp[index] != -1)return dp[index] + 1;


        maxInd = maxInd > index + nums[index] ? maxInd : index + nums[index];

        // System.out.println(maxInd);
        if(maxInd <= index)return 100_01;

        if(maxInd >= nums.length-1){
            dp[index] = 1;
            return dp[index] + 1;
        }

        int minVal = 100_01;
        int val = 0;
        for(int i=index + 1; i <= index + nums[index] && i < nums.length; i++){
            val = findMin(nums,dp,i,maxInd);
            minVal = val < minVal ? val : minVal;
        }

        return (dp[index] = minVal) + 1;

    }
    public int jump(int[] nums) {
        int dp[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++)dp[i] = -1;
        findMin(nums,dp,0,0);
        return dp[0] == -1 ? 0 : dp[0];
    }
}
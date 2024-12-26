class Solution {
    public void findCount(int nums[],int target,int sum,int count[],int index){
        // System.out.println(sum);
        if(index==nums.length){
            if(sum==target)count[0]++;
            return;
        }
        findCount(nums,target,sum+nums[index],count,index+1);
        findCount(nums,target,sum-nums[index],count,index+1);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int count[]=new int [1];
        count[0]=0;
        findCount(nums,target,0,count,0);
        return count[0];
    }
}
class Solution {
    public int waysToSplitArray(int[] nums) {
        // long prefixSum[]=new long[nums.length];
        // prefixSum[0]=nums[0];
        // for(int i=1;i<nums.length;i++)prefixSum[i]=nums[i]+prefixSum[i-1];
        // int count=0;
        // for(int i=0;i<nums.length-1;i++) if(prefixSum[i] >= prefixSum[prefixSum.length-1]-prefixSum[i])count++; 
        // return count;

        long sum=0;
        long curSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        System.out.println(sum);
        for(int i=0;i<nums.length-1;i++){
            curSum+=nums[i];
            if(curSum >= sum -curSum)count++;
        }
        return count;

    }
}
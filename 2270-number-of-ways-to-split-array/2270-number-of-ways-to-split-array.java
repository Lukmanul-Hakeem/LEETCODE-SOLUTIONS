class Solution {
    public int waysToSplitArray(int[] nums) {
        long prefixSum[]=new long[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)prefixSum[i]=nums[i]+prefixSum[i-1];
        // for(int i=0;i<nums.length;i++)System.out.println(prefixSum[i]);
        int count=0;
        for(int i=0;i<nums.length-1;i++) if(prefixSum[i] >= prefixSum[prefixSum.length-1]-prefixSum[i])count++; 
        return count;

    }
}
class Solution {
    public int missingNumber(int[] nums) {
        long n=nums.length;
        long nsum=n*(n+1)/2;
        long sum=0;
        for(int val:nums){
            sum+=val;
        }
        return (int)(nsum-sum);
    }
}
class Solution {
    public long maximumTripletValue(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int [nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];

        int n = nums.length;
        int max1=0,max2=0;
        prefix[0]=suffix[n-1]=0;
        for(int i=1;i<n;i++){
            max1 = max1 > nums[i-1] ? max1 : nums[i-1];
            prefix[i]=max1;

            max2 = max2 > nums[n-i] ? max2 : nums[n-i];
            suffix[n-1-i] = max2;
        }
        for(int val : suffix)System.out.println(val);

        long max = 0;

        for(int i=1;i<n;i++){
            max = max > (long)(prefix[i]-nums[i])*suffix[i] ? max : (long)(prefix[i]-nums[i])*suffix[i];
        }

        return max;
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int count = 0;
        int negMax =  Integer.MIN_VALUE;
        for(int val : nums){
            if(val < 0)count++;
            negMax = Math.max(negMax, val);
        }
        if(count == nums.length)return negMax;

        
        int min = Integer.MAX_VALUE;
        int totalSum = 0;
        int sum = 0;

        for(int val : nums){
            totalSum += val;
            sum += val;
            if(sum > 0) sum = 0;
            min = Math.min(min, sum);
        }

        int max = Integer.MIN_VALUE;
        sum = 0;
        for(int val : nums){
            sum += val;
            if(sum < 0) sum = 0;
            max = Math.max(max, sum);
        }


        return Math.max(totalSum - min, max);
        
    }
}
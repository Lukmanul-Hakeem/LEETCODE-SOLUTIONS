class Solution {
    public long maximumTripletValue(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int [nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];

        // for(int i =1;i<nums.length;i++){
        //     prefix[i] = prefix[i-1] > nums[i] ? prefix[i-1] : nums[i];
        //     suffix[nums.length-1-i] = suffix[nums.length-i] > nums[nums.length-1-i] ? suffix[nums.length-i] : nums[nums.length-1-i];
        // }
        int max1=nums[0];
        int max2=nums[nums.length-1];
        for(int i =1;i<nums.length;i++){
            
            prefix[i] = max1;
            max1 = prefix[i-1] > nums[i] ? prefix[i-1] : nums[i];

            suffix[nums.length-1-i] = max2;
            max2 = suffix[nums.length-i] > nums[nums.length-1-i] ? suffix[nums.length-i] : nums[nums.length-1-i];

            // suffix[nums.length-1-i] = suffix[nums.length-i] > nums[nums.length-1-i] ? suffix[nums.length-i] : nums[nums.length-1-i];
        }

        for(int val : suffix)System.out.println(val);
        long max=0;
        for(int i =0;i<nums.length;i++){
            System.out.println(prefix[i]+" "+nums[i]+" "+suffix[i]+" = "+(long)(prefix[i]-nums[i])*suffix[i]);
            if(prefix[i]!=nums[i] && suffix[i]!=nums[i])max = max > (long)(prefix[i]-nums[i])*suffix[i] ? max : (long)(prefix[i]-nums[i])*suffix[i];
        }

        return max;
    }
}
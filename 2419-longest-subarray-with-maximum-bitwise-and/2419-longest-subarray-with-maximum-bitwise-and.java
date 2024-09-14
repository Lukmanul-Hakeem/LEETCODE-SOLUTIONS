class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }

        int count=0;
        System.out.println(index);
        int maxindex=0;
        
        for(int i=index;i<nums.length;i++){
            if(nums[i]==max){
                while(i<nums.length && nums[i]==max){
                    count++;
                    i++;
                }
                if(count>maxindex)maxindex=count;
                count=0;
            }
        }



    
        return maxindex;
    }
}
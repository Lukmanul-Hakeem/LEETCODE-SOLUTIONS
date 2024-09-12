class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        for(int val:nums){
            if(val<k)count++;
        }
        return count;
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 1 && nums[0] == val)return 0;
        int i=0;
        int j=nums.length-1;
        int count = 0;
        while(i<nums.length && j>=0 && i<j){
            while(i < nums.length && nums[i] != val)i++;
            while( j>=0 && nums[j] == val){
                j--;
                count++;
            }
            //System.out.println(i+" "+j);
            if(i<nums.length && j>=0 && i<j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }   

        return nums.length - count;
    }
}
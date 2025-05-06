class Solution {
    public int removeDuplicates(int[] nums) {
        int map[] = new int[203];
        for(int val : nums)map[val+100]++;
        int k=0;
        for(int i=0;i<202;i++){
            if(map[i] >= 1){
                nums[k] = i-100;
                k++;
            }
        }

        return k;
    
    }
}
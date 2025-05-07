class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int element = 0;
        for(int val : nums){
            if(vote == 0){
                element = val;
                vote = 1;
            }else if(element == val) vote++;
            else vote--;
        }
        return element;
    }
}
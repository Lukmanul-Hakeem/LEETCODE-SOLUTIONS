class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int map[]=new int[51];
        int xor=0;
        for(int val:nums){
            if(map[val]==1){
                xor^=val;
            }else{
                map[val]++;
            }
        }
        return xor;
        
    }
}
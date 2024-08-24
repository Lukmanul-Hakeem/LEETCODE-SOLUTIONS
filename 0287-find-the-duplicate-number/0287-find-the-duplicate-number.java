class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            if(map.get(val)==null){
                map.put(val,1);
            }else{
                return val;
            }
        }
        return 0;
    }
}
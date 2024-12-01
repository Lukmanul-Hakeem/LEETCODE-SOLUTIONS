class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer,Boolean> map =new HashMap();
        for(int x:nums)if(map.get(x)==null)map.put(x,true);
        while(map.get(original)!=null)original*=2;
        return original;
    }
}
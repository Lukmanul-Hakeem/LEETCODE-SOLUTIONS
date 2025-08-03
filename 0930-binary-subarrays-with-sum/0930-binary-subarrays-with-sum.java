class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // return 13;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int diff = 0, count = 0;
        map.put(0, 1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            diff = sum - goal;
           
            count += map.getOrDefault(diff, 0);

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return count;
    }
}
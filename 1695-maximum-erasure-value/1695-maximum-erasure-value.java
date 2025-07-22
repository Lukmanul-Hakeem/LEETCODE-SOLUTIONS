class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0, right = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(right < nums.length){
            sum += nums[right];
            map.put(nums[right],map.getOrDefault(nums[right], 0) + 1);

            while(map.get(nums[right]) > 1){
                
                if(map.get(nums[left]) == 1){
                    map.remove(nums[left]);
                }
                else {
                    map.put(nums[left], map.get(nums[left]) - 1);
                }
                
                sum -= nums[left];
                left++;
            }

            max = Math.max(max, sum);
            right++;
        }

        return max;
    }
}
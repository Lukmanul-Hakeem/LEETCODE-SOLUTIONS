class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int left = 0, right = 0;
        long count = 0;
        long curLength = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {

                while (right < nums.length && nums[right] == 0)
                    right++;

                curLength = right - left;
                
                count += ((curLength) * (curLength + 1)) / 2;
                left = right;

            } else {

                right++;
                left++;

            }
        }

        return count;
    }
}
class Solution {
    public int maximumLength(int[] nums) {
        int evenCount = 0, oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        // Case 1: All same parity (sum % 2 == 0)
        int sameParityMax = Math.max(evenCount, oddCount);

        // Case 2: Alternating parity (sum % 2 == 1)
        int altParityMax = getAlternatingParityLength(nums);

        return Math.max(sameParityMax, altParityMax);
    }

    // Returns longest subsequence with alternating parity
    private int getAlternatingParityLength(int[] nums) {
        int len = 0;
        int lastParity = -1;

        for (int num : nums) {
            int parity = num % 2;
            if (parity != lastParity) {
                len++;
                lastParity = parity;
            }
        }

        return len;
    }
}
class Solution {
    public int longestPalindromeSubseq(String s) {
        String str = new StringBuilder(s).reverse().toString();

		int dp[][] = new int[str.length() + 1][s.length() + 1];
        int max = Integer.MIN_VALUE;
        for(int i = str.length() - 1;i>=0;i--){
            for(int j = s.length() - 1;j>=0;j--){
                if(str.charAt(i) == s.charAt(j))max = Math.max(max,(dp[i][j] = 1 + dp[i+1][j+1]));
                else dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }

		return dp[0][0];
    }
}
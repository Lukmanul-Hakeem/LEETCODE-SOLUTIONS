class Solution {
    public int minInsertions(String s) {
        String str = new StringBuilder(s).reverse().toString();
        int dp[][] = new int[s.length() + 1][str.length() + 1];

        for(int i=s.length()-1;i>=0;i--){
            for(int j=str.length()-1;j>=0;j--){
                if(s.charAt(i) == str.charAt(j))dp[i][j] = 1 + dp[i+1][j+1];
                else dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        return str.length() - dp[0][0];
    }
}
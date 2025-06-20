class Solution {
    public int findLongest(String str1,String str2,int index1,int index2,int dp[][]){
        if(index1 == str1.length() || index2 == str2.length())return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        int val1,val2,val3,val4;
        int max = Integer.MIN_VALUE;
        if(str1.charAt(index1) == str2.charAt(index2))max = Math.max(max,1 + findLongest(str1,str2,index1+1,index2+1,dp));
        else{
            max = Math.max(max,findLongest(str1,str2,index1+1,index2,dp));
            max = Math.max(max,findLongest(str1,str2,index1+1,index2+1,dp));
            max = Math.max(max,findLongest(str1,str2,index1,index2+1,dp));
        }
        return dp[index1][index2] = max;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int [text1.length() + 1][text2.length() + 1];
        for(int i=0;i<text1.length();i++)Arrays.fill(dp[i],-1);
        return findLongest(text1,text2,0,0,dp);
    }
}
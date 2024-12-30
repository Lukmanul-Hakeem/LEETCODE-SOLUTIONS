class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        long  dp[]=new  long[high+1];
        dp[0]=1;
        int mod =(int) Math.pow(10,9) + 7;
        for(int i=1;i<=high;i++){
            if(i >= zero)dp[i]=(dp[i]+dp[i-zero])%mod;
            if(i >= one)dp[i]=(dp[i]+dp[i-one])%mod;
        }
        // long long result=0;
        long result=0;

        for(int i=low;i<=high;i++)result=(result+dp[i])%mod;
        // return (int) (result % (Math.pow(10,9)+7));
        return (int)result;
    }
}
class Solution {
    public long findpoints(int questions[][],int index,long dp[]){
        if(index >= questions.length)return 0;

        if(dp[index]!=-1)return dp[index];
        long max = 0;
        long val = 0;
        
        for(int i=questions[index][1]+index+1;i<=questions.length;i++){
            val = findpoints(questions,i,dp);
            max = val > max ? val : max;
        }

        dp[index] = max + (long)questions[index][0];

        return dp[index];
    }
    public long mostPoints(int[][] questions) {

        int n = questions.length;
        long dp[] = new long [n];
        HashMap<Integer,Long> map = new HashMap<>();


        // for(int i=0;i<n;i++)dp[i]=-1;

        // for(int i=0;i<n;i++)findpoints(questions,i,dp);
        // long max =0;
        // for(long val : dp) max = max > val ? max : val;

        long dpval=0;
        long max=0;
        for(int i=n-1;i>=0;i--){
            dpval=0;
            if(questions[i][1]+i+1<n){
                dpval=map.get(questions[i][1]+i+1);
            }
            dp[i]=dpval+questions[i][0];
            max = max > dp[i] ? max : dp[i];
            map.put(i,max);
        }

        long max1=0;
        // for(long val : dp)System.out.print(val+" ");
        for(long val : dp) max1 = max1 > val ? max1 : val;

        return max1;
    }
}
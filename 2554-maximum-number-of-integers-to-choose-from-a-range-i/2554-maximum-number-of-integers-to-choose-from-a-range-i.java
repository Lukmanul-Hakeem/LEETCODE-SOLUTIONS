class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Boolean A[]=new Boolean [n];
        for(int i=0;i<n;i++)A[i]=false;
        for(int i=0;i<banned.length;i++){
            if(banned[i]<=n)A[banned[i]-1]=true;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(!A[i] && (i+1)<=maxSum){
                maxSum-=(i+1);
                sum++;
            }else if((i+1)>maxSum)return sum;
        }
        return sum;
    }
}
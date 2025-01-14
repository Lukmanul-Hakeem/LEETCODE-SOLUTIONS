class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int map[]=new int[A.length+1];
        int ans[]=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                count++;
                ans[i]=count;
            }else{
                map[A[i]]++;
                map[B[i]]++;
                if(map[A[i]]==2 || map[B[i]]==2){
                    count++;
                    if(map[B[i]]==2 && map[A[i]]==2){
                        count++;
                    }
                    ans[i]=count;
                }else ans[i]=count;
            }
        }
        return ans;
    }
}
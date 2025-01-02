class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefixSum[]=new int [words.length];
        int count=0;
        for(int i=0;i<words.length;i++){
            int len=words[i].length()-1;
            if(
                (
                    words[i].charAt(0) == 'a' || 
                    words[i].charAt(0) == 'e' || 
                    words[i].charAt(0) == 'i' || 
                    words[i].charAt(0) == 'o' || 
                    words[i].charAt(0) == 'u' 
                ) 
                &&
                (
                    words[i].charAt(len) == 'a' || 
                    words[i].charAt(len) == 'e' || 
                    words[i].charAt(len) == 'i' || 
                    words[i].charAt(len) == 'o' || 
                    words[i].charAt(len) == 'u' 
                )
            )count++;
            prefixSum[i]=count;
        }
        // for(int x : prefixSum)System.out.println(x);
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=prefixSum[queries[i][1]]-(queries[i][0] == 0 ? 0 : prefixSum[queries[i][0]-1]);
        }
        return ans;
    }
}
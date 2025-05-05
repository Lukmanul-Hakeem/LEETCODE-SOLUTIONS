class Solution {
    public int numTilings(int n) {
        
        if(n>=3){
            long prev = 5;
            long prev2 = 2;
            long prev3 = 1;
            long current = 5;
            long temp = 0;
            for(int i=4;i<=n;i++){
                current = (2*prev + prev3) % 1000_000_007;
                prev3 = prev2;
                prev2 = prev;
                prev = current;
            }
            return (int)current;
        }else{
            return n;
        }
    }
}
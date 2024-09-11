class Solution {
    public int minBitFlips(int start, int goal) {
        int num=(start^goal);
        int count=0;
        while(num!=0){
            if((1 & num)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}
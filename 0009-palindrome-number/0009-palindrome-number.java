class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)return false;
        int reverse=0;
        int val=x;
        while(val!=0){
            reverse=reverse*10+(val%10);
            val/=10;
        }
        return reverse == x ? true : false;
    }
}
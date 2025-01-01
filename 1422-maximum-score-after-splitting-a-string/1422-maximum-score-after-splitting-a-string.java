class Solution {
    public int maxScore(String s) {
        int noOfZero=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')noOfZero++;
        }
        int noOfOne=s.length()-noOfZero;
        int countZero=0;
        int max=0;
        if(noOfOne == 0 || noOfZero == 0)return s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')countZero++;
            max= max > (countZero + (noOfOne - (i+1-countZero))) ? max : (countZero + (noOfOne - (i+1-countZero)));
        }
        return max;
    }
}
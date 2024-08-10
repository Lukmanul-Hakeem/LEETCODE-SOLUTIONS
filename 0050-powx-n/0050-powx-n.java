class Solution {
    public double FindPower(double x,int n){
        if(n==0){
            return 1;
        }
        double half= FindPower(x,n/2);
        double halfsqr=half*half;
        if(n%2!=0){
            halfsqr=x*halfsqr;
        }
        return halfsqr;
    }
    public double myPow(double x, int n) {
        if(n>=0){
            return FindPower(x,n);
        }else{
            return FindPower(1/x,-n);
        }
    }
}
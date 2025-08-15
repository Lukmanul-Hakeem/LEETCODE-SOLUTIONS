bool isPowerOfFour(int n) {
    
    if(n==1){
        return true;
    }else if(n<4){
        return false;
    }
    if(n%4!=0){
        return false;
    }
    return isPowerOfFour(n/4);
    
}

bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    double reverse=0;
    for(int i=x;i>0;i/=10){
        reverse=reverse*10+(i%10);
    }
    printf("%d",reverse);
    if(reverse==x){
        return true;
    }
    return false;
}
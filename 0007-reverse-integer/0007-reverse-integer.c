int reverse(int x){
    if(x==-pow(2,31)) return 0;
    int count=0;
    int sign=0; //'1' if x is negative and '0' if x is positive
    if(x<0){
        x=x*(-1);
        sign=1;
        printf("hello\n");
        
    }
    for(long int pos=1;x/pos>0;pos*=10){
        count++;
    }
    //printf("%d",count);
    long int z=0;
    for(long int pos=1;x/pos>0;pos*=10){
        count--;
        z=z+(x/pos)%10*pow(10,count);
        printf("%d ",z);
    }
    if(z<(-pow(2,31)) || z>(pow(2,31)-1)) return 0;
    if(sign==1){
        return -z;
    }
    return z;
}
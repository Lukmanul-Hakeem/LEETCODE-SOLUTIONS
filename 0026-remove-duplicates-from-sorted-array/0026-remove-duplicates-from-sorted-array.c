int removeDuplicates(int* A, int n) {
    int i=0;
    int j=1;
    
    while(j<n){
        if(A[j]==A[i]){
            j++;
        }else{
            i++;
            A[i]=A[j];
        }
    }
    return i+1;
    
}
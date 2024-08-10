int removeElement(int* A, int n, int key) {
    int i=0;
    int j=0;
    int count=0;
    while(j<n){
        if(A[j]!=key){
            A[i]=A[j];
            count++;
            i++;
            
        }
        j++;
    }
   return count;
}
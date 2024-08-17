int majorityElement(int A[], int size) {
    int vote=1;
    int majority=A[0];
    for(int i=1;i<size;i++){
        if(vote==0){
            vote++;
            majority=A[i];
        }else if(A[i]==majority){
            vote++;
        }else{
            vote--;
        }
    }
    return majority;
}
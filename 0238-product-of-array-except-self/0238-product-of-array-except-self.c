/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* A, int size, int* returnSize) {
    int *array=(int*)malloc(size*sizeof(int));
    int k=0;
    int product=1;
    int numcountofzero=0;
    int index;
    *returnSize=size;
    while(k!=size){
        array[k]=0;
        if(A[k]==0){
            index=k;
            numcountofzero++;
            //if(numcountofzero>1)return array;
            k++;
            continue;
        }
        product*=A[k];
        k++;
    }
    if(numcountofzero==1){
        array[index]=product;
        return array;
    }else if(numcountofzero>1){
        return array;
    }
    k=0;
    while(k!=size){
        array[k]=product/A[k];
        k++;
    }
    return array;
}
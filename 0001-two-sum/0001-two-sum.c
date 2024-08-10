int* twoSum(int* num, int size, int target, int* returnSize) {
    int* result = NULL;
    result = (int*)malloc(2 * sizeof(int));
    int i=0;
    int j=size-1;
    *returnSize=2;
    while(1){
        if(i==j){
            i++;
            j=size-1;
        }
        if(num[i]+num[j]==target){
            result[0]=i;
            result[1]=j;
            return result;
        }else{
            j--;
        }
    }
}
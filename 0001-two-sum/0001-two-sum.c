// /**
//  * Note: The returned array must be malloced, assume caller calls free().
//  */
// int* twoSum(int A[], int size, int target, int* returnSize) {
//     int *index=(int *)malloc(2*sizeof(int));
//     int i=0,j=size-1;
//     *returnSize=2;
//     while(i<j){
//         if(A[i]+A[j]==target){
//             index[0]=i;
//             index[1]=j;
//             return index;
//         }else{
//             if(A[i]+A[j]>target){
//                 j--;
//             }else{
//                 i++;
//             }
//         }
//     }
//     free(index);
//     return NULL;
// }

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
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
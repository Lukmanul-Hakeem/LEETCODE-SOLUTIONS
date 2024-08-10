int binarySearch(int A[],int low,int high,int target,int ans){
    if(low>high){
        return ans;
    }
    int mid=(low+high)/2;
    if(A[mid]<=target){
        return binarySearch(A,mid+1,high,target,ans);
    }else{
        ans=mid;
        return binarySearch(A,low,mid-1,target,ans);
    }
}
int* searchRange(int* nums, int size, int target, int* returnSize) {
    int *ans=(int*)malloc(2*sizeof(int));
    int start=binarySearch(nums,0,size-1,target-1,size);
    int end=binarySearch(nums,0,size-1,target,size);
    *returnSize=2;
    if(start==end){
        ans[0]=-1;
        ans[1]=-1;
       // return [-1,-1];
    }else{
        ans[0]=start;
        ans[1]=end-1;
    }
    return ans;
}
class Solution {
    public int binarySearch(int A[],int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(A[mid]==target){
            return mid;
        }
        if(A[low]<=A[mid]){
            if(A[low]<=target && A[mid]>=target){
                return binarySearch(A,low,mid-1,target);
            }else{
                return binarySearch(A,mid+1,high,target);
            }
        }else{
            if(A[mid]<=target && A[high]>=target){
                return binarySearch(A,mid+1,high,target);
            }else{
                return binarySearch(A,low,mid-1,target);
            }
        }
    }
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target){
            return 0;
        }else if(nums.length==1){
            return -1;
        }
        return binarySearch(nums,0,nums.length-1,target);
    }
}
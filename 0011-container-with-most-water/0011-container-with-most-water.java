class Solution {
    public int maxArea(int[] A) {
        int max=Integer.MIN_VALUE;
        int area=0;
        int left=0;
        int right=A.length-1;
        while(left<right){
            if(A[left]<A[right]){
                area=A[left]*(right-left);
                left++;
            }else{
                area=A[right]*(right-left);
                right--;
            }
            max=Math.max(max,area);
        }
        return max;
    }
}
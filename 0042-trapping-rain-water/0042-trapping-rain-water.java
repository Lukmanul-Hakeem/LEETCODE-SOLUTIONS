class Solution {
    public int trap(int[] height) {
       int left=0;
       int right=height.length-1;
       int leftmax=height[left];
       int rightmax=height[right];
       int TrappingWater=0;
       while(left<right){
        if(leftmax<rightmax){
            TrappingWater+=(leftmax-height[left]);
            left++;
            leftmax=Math.max(height[left],leftmax);
        }else{
            TrappingWater+=(rightmax-height[right]);
            right--;
            rightmax=Math.max(rightmax,height[right]);
        }
       }
       return TrappingWater;
    }
}
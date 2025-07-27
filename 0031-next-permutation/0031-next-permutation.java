class Solution {
    public void reverseTheArray(int nums[], int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int prev = nums[n-1];
        int i = 0;
        for(i = n-2; i>= 0; i--){
            if(prev > nums[i]){
                break;
            }
            prev = nums[i];
        }
        System.out.println(i);
        if(i == -1)reverseTheArray(nums,0,n-1);
        else{
            int val = nums[i];
            for(int j = n-1; j >= 0; j--){
                if(nums[j] > nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
            reverseTheArray(nums,i+1,n-1);
        }
    }
}
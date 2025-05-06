class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int i=0;
        int val = nums[0];
        int n = nums.length;
        int count = 0;
        while(j<nums.length){
            while(j<n && nums[j] == val){
                j++;
                count++;
            }

            if(j<n && count>2){
                nums[i]=val;
                nums[i+1]=val;
                i+=2;
                val = nums[j];
                count = 0;
                System.out.println("hello "+i+" "+val+" "+j);
            }else {
                nums[i] = val;
                if(count >= 2)nums[i+1] = val;
                //if(j==n)break;
                if(j<n) val = nums[j];
                else break;
                i+=count;
                count = 0;
                System.out.println("hey "+i+" "+j);
            }
        }
        int ans = count <= 2 ? i + count : i + 2;
        return ans;
    }
}
class Solution {
    public void findcount(int nums[],int count[],int curOr,int index,int or){
        //if(index==nums.length)return;
        if(curOr==or){
            // System.out.println(count[0]+" "+index);
            //count[0]+=nums.length-index;
            count[0]++;
            //return;
        }
        for(int i=index;i<nums.length;i++){
            findcount(nums,count,curOr|nums[i],i+1,or);
        }
    }

    public int countMaxOrSubsets(int[] nums) {
        int or=0;
        for(int i=0;i<nums.length;i++)or|=nums[i];
        int count[]=new int[1];
        findcount(nums,count,0,0,or);
        return count[0];
    }
}
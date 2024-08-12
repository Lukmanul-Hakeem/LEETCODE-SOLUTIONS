class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
        int leftpointer=0;
        int rightpointer=nums.size()-1;
       // for(int i=0;i<nums.size();i++)System.out.print(nums.get(i)+"|"+i+" ");
        while(leftpointer<rightpointer){
            if((nums.get(leftpointer)+nums.get(rightpointer))<target){
                count+=rightpointer-leftpointer;
                leftpointer++;
                //rightpointer--;
            }else rightpointer--;
            
        }
        return count;
    }
}
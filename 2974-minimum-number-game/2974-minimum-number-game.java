class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int arr[]=new int[nums.length];
        int alice=0;
        int bob=0;
        int k=0;
        for(int i=0;i<nums.length;i++)pq.add(nums[i]);
        while(!pq.isEmpty()){
            alice=pq.remove();
            if(!pq.isEmpty()){
                bob=pq.remove();
                //System.out.println(alice+" "+bob);
                arr[k]=bob;
                k++;
            }
            arr[k]=alice;
            k++;
        }
        return arr;
    }
}
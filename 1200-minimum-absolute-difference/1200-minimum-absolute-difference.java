class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        //for(int val : arr)System.out.print(val+" ");
        int min = Integer.MAX_VALUE;
        int prev = arr[0];
        int val = 0;

        for(int i=1;i<arr.length;i++){
            val = arr[i] - prev;
            min = min > Math.abs(val) ? Math.abs(val) : min;
            prev = arr[i];
        }
        //System.out.println(min);
        prev = arr[0];
        
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            val = prev - arr[i];
            if(Math.abs(val) == min){
                list.add(new ArrayList<>(Arrays.asList(prev,arr[i])));
            }
            prev = arr[i];
        }
        return list;
    }
}
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        // for(int arr[] : intervals){
        //     System.out.println(arr[0]+" "+arr[1]);
        // }

        int prev = intervals[0][1];
        int count = 0;

        for(int i=1; i<intervals.length; i++){
            if(prev > intervals[i][0]){
                count++;
                continue;
            }
            // System.out.println(prev);
            prev = intervals[i][1];
            
        }

        return count;
    }
}


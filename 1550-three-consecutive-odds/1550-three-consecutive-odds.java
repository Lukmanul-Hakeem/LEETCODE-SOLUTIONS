class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 0; i<n ; i++){
            if(arr[i] % 2 == 1){
                count = 0;
                while(i<n && arr[i]%2 == 1 && count < 3){
                    count++;
                    i++;
                }
                if(count >= 3)return true;
            }
            
        }

        return false;

    }
}
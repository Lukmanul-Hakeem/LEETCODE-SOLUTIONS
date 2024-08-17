class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=max>candies[i]?max:candies[i];
        }
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            result.add((candies[i]+extra)>=max?true:false);
        }
        return result;
    }
}
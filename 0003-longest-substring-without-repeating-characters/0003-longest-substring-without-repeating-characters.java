class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),i);
                count++;
            }else{
                max=max>count?max:count;
                i=map.get(s.charAt(i));
                count=0;
                map.clear();
            }
            max=max>count?max:count;
        }
        return max;
    }
}
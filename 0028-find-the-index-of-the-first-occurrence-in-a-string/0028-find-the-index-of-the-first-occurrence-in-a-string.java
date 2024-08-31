class Solution {
    public int find(String haystack,char needle,int index){
        for(int i=index;i<haystack.length();i++){
            if(haystack.charAt(i)==needle){
                return i;
            }
        }
        return -1;
    }
    public int strStr(String haystack, String needle) {
        
        int index=-1;
        for(int i=0;i<haystack.length();i++){
            index=find(haystack,needle.charAt(0),i);
            if(index==-1){
                return -1;
            }
            i=index;
            for(int j=0;j<needle.length() && i<haystack.length();j++,i++){
                if(haystack.charAt(i)!=needle.charAt(j)){
                    break;
                }else if(j==needle.length()-1){
                    return index;
                }
            }
        }
        return -1;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minsize=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            minsize=minsize<str.length()?minsize:str.length();
        }

        int k=0;
        boolean flag=true;
        char ch;
        StringBuilder result=new StringBuilder("");

        while(flag && k<minsize){
            ch=strs[0].charAt(k);
            for(int i=0;i<strs.length;i++){
                if(ch!=strs[i].charAt(k)){
                    flag=false;
                }
            }
            if(flag)result.append(ch);
            k++;

        }
        return result.toString();
    }
}
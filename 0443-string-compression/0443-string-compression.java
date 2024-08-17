class Solution {
    public int compress(char[] chars) {
        int returnsize=0;
        Integer count=1;
        //char ch=chars[0];
        for(int i=0;i<chars.length;i++){
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            chars[returnsize]=chars[i];
            returnsize++;
            if(count>9){
                String countstr=Integer.toString(count);
                for(int j=0;j<countstr.length();j++){
                    chars[returnsize]=countstr.charAt(j);
                    returnsize++;
                }
            }else if(count>1){
                chars[returnsize]=Integer.toString(count).charAt(0);
                returnsize++;
            }
            count=1;
        }
        return returnsize;
    }
}
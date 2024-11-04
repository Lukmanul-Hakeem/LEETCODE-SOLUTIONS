class Solution {
    public String compressedString(String chars) {
        //int returnsize=0;
        Integer count=1;
        StringBuilder ans=new StringBuilder("");
        //char ch=chars[0];
        for(int i=0;i<chars.length();i++){
            while(i<chars.length()-1 && chars.charAt(i)==chars.charAt(i+1)){
                count++;
                i++;
            }
            //chars[returnsize]=chars[i];
            //returnsize++;
            if(count>9){
                // ans.append(9);
                // ans.append(chars.charAt(i));
                // ans.append(count-9);
                // ans.append(chars.charAt(i));

                while(count>=1){
                    ans.append(count>=9?9:count);
                    ans.append(chars.charAt(i));
                    count-=9;
                }

                // String countstr=Integer.toString(count);
                // for(int j=0;j<countstr.length();j++){
                //     chars[returnsize]=countstr.charAt(j);
                //     returnsize++;
                // }
            }else{
                ans.append(count);
                ans.append(chars.charAt(i));
            }
            count=1;
        }
        return ans.toString();
    }
}
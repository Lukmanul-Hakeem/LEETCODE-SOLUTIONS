class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder("");
        int count=0;
        char ch='0';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                //System.out.println(s.charAt(i)+" "+ch);
                count=1;
                ch=s.charAt(i);
                str.append(s.charAt(i));
            }else{
                //System.out.println("hello");
                if(count>=2)continue;
                else{
                    str.append(s.charAt(i));
                    count++;
                }
            }
        }
        return str.toString();
    }
}
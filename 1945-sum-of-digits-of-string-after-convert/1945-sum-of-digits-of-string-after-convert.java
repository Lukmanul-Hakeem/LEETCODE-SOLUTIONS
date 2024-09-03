class Solution {
    public int getLucky(String s, int k) {
        String str1=new String("");
        for(int i=0;i<s.length();i++)str1+=s.charAt(i)-'a'+1;

        int sum=0;
        int j=0;
        while(j<k){
            s=new String(str1);
            sum=0;
            for(int i=0;i<s.length();i++){
                sum+=s.charAt(i)-'0';
            }
            str1=new String(Integer.toString(sum));
            j++;
        }
        return sum;
    }
}
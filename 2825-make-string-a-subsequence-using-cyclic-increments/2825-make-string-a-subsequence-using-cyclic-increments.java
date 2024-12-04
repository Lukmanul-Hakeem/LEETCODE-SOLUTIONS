class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str1.length()<str2.length())return false;
        int l1=str1.length();
        int l2=str2.length();
        int i=0;
        int j=0;
        while(i<l1 && j<l2){

            char ch1=str1.charAt(i);
            char ch2=(char)((ch1=='z') ? 'a' : (ch1+1));

            if(ch1==str2.charAt(j) || ch2==str2.charAt(j))j++;
            i++;
        }
        
        return j==l2;

    }
}
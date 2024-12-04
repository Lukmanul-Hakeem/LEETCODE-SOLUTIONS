class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str1.length()<str2.length())return false;
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){

            char ch1=str1.charAt(i);
            char ch2=(char)((ch1=='z') ? 'a' : (ch1+1));

            if(ch1==str2.charAt(j) || ch2==str2.charAt(j))j++;
            i++;
        }
        
        return j==str2.length();

    }
}
class Solution {
    public char findTheDifference(String s, String t) {
        int map[]=new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            map[t.charAt(i)-'a']--;
        }
        char ch='a';
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<26;i++){
            if(map[i]!=0){
                ch+=i;
                return ch;
            }
        }
        return ' ';
    }
}
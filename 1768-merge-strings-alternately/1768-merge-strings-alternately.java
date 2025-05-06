class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder("");
        int i=0;
        int index1 = 0;
        int index2 = 0;
        int flag = 0;
        while(i < word1.length() && i < word2.length()){
            if(flag == 0){
                str.append(word1.charAt(index1));
                index1++;
                flag = 1;
            }else{
                str.append(word2.charAt(index2));
                index2++;
                i++;
                flag = 0;
            }
            
        }

        if(i < word1.length())str.append(word1.substring(i));
        else str.append(word2.substring(i));

        return str.toString();
    }
}
class Solution {
    public boolean isCircularSentence(String sentence) {
        //int flag=0;
        int count=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                count++;
                if(sentence.charAt(i-1)!=sentence.charAt(i+1))return false;
            }
        }

        
        if(sentence.charAt(0)==sentence.charAt(sentence.length()-1))return true;
        else return false;
        

        //return true;

    }
}
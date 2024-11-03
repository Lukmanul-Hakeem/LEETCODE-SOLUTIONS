class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        String str=s+s;
        System.out.print(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==goal.charAt(0)){
                if (i + goal.length() <= str.length() && str.substring(i, i + goal.length()).equals(goal)) {
    return true;
}
            }
        }
        return false;
    }
}
class Solution {
    public String longestPrefix(String s) {
        
        int A[]=new int[s.length()];
        for(int i=0;i<A.length;i++)A[i]=0;

        int i=0;
        int j=1;

        for(j=1;j<s.length();j++){
            while(i!=0 && s.charAt(i)!=s.charAt(j)){
                i=A[i-1];
            }

            if(s.charAt(i)==s.charAt(j)){
                //System.out.println(s.charAt(i));
                i++;
            }
            A[j]=i;
        }

        

        return s.substring(0,A[A.length-1]);
    }
}
class Solution {
    public int myAtoi(String s) {
        int i=0;
        int flag=1;
        long val=0;
        while(i<s.length()){
            //System.out.println(val+" ");

            if((s.charAt(i)=='.' || s.charAt(i)>='A' && s.charAt(i)<='Z')|| (s.charAt(i)>='a'&& s.charAt(i)<='z')){
                System.out.print(s.charAt(i)+" ");
                break;
                
            }
            else if((s.charAt(i)=='-'||s.charAt(i)=='+'|| (s.charAt(i)>='0' && s.charAt(i)<='9')) ||   val==0 && s.charAt(i)>='0' && s.charAt(i)<='9'){
                System.out.print(s.charAt(i)+" |");
                if(s.charAt(i)=='-'){
                    i++;
                    flag=-1;
                }
                else if(s.charAt(i)=='+'){
                    flag=1;
                    i++;
                }
                //val=0;
                while(i!=s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                    if(val*(long)flag<Integer.MIN_VALUE)return Integer.MIN_VALUE;
                    else if(val*(long)flag>Integer.MAX_VALUE)return Integer.MAX_VALUE;

                    //System.out.println(val+" ");
                }
                break;
            }else{

                //System.out.print(s.charAt(i)+" ");
                i++;
            }
        }
        System.out.print(flag+" "+val);
        if(val*(long)flag<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        else if(val*(long)flag>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        return (int)val*flag;
    }
}
class Solution {
    public int romanToInt(String s) {
        int val=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='I')val+=1;
            else if(s.charAt(i)=='V'){
                if(i-1>=0 && s.charAt(i-1)=='I'){
                    val+=4;
                    i--;
                }else val+=5;
            
            }else if(s.charAt(i)=='X'){
                if(i-1>=0 && s.charAt(i-1)=='I'){
                    val+=9;
                    i--;
                }else val+=10;
            }else if(s.charAt(i)=='L'){
                if(i-1>=0 && s.charAt(i-1)=='X'){
                    val+=40;
                    i--;
                }else val+=50;
            }else if(s.charAt(i)=='C'){
                if(i-1>=0 && s.charAt(i-1)=='X'){
                    val+=90;
                    i--;
                }else val+=100;
            }else if(s.charAt(i)=='D'){
                if(i-1>=0 && s.charAt(i-1)=='C'){
                    val+=400;
                    i--;
                }else val+=500;
            }else if(s.charAt(i)=='M'){
                if(i-1>=0 && s.charAt(i-1)=='C'){
                    val+=900;
                    i--;
                }else val+=1000;
            }
        }
        return val;
    }
}
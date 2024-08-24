class Solution {
    public int findComplement(int num) {
        int i=1;
        int count=0;
        int power=1;
        int x=num;
        while(num!=0){
            if((num & 1)==1)count=i;
            i++;
            num=num/2;
        }
        for (int j=0;j<count;j++)power*=2;
        return x^(power-1);
    }
}
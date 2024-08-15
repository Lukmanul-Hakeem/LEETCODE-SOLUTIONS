class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0;
        int count10=0;
        int count20=0;
        int change=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
                change+=5;
            }else if(bills[i]==10 && count5>0){
                count5--;
                change+=5;
                count10++;
            }else if(bills[i]==20 && (count5>2 || (count10>0 && count5>0))){
                if(count5>2 && count10==0){
                    count5-=3;
                    continue;
                }
                count5--;
                count10--;
                count20++;
                change+=5;
            }else return false;
        }
        return true;
    }
}
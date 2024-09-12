class Solution {

    public int[] missingRolls(int[] rolls, int mean, int n) {

        if(mean==6){
            for(int val:rolls){
                if(val<6)return new int[0];
            }
        }

        int sum=0;
        for(int val:rolls)sum+=val;

        int Nsum=(rolls.length+n)*mean - sum;
        System.out.println(Nsum);
        if(Nsum<n || Nsum/n>6 )return new int [0];

        int ans[]=new int [n];
        
        for(int i=0;i<n;i++)ans[i]=Nsum/n;

        for(int i=0;i<Nsum%n;i++){
            if(ans[i]==6)return new int[0];
            ans[i]++;
        }
        return ans;
        
    }
}
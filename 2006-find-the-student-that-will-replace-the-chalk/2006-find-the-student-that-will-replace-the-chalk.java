class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        long total=0;
        for(int val:chalk)total+=val;
        while(total<=k){
            k=k-(int)total;
        }
        System.out.println(k);
        while(k!=0 && k>=chalk[i]){
            k=k-(chalk[i%chalk.length]);
            i++;
        }
        return i%chalk.length;
    }
}
class Solution {
    public int[] findArray(int[] pref) {
        int xor=pref[0];
        for(int i=1;i<pref.length;i++){
            pref[i]=xor^pref[i];
            xor^=pref[i];
        }
        return pref;
    }
}
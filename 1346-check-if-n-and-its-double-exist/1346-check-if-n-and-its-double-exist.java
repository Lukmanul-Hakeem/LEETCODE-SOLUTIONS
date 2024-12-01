class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Boolean> map=new HashMap();
        int zeroCount=0;
        for(int x: arr){
            if(x==0)zeroCount++;
            if(map.get(x)==null)map.put(x,true);
        }
        System.out.println(zeroCount);
        for(int x:arr){
            if(x==0){
                if(zeroCount>=2)return true;
            }else if(map.get(2*x)!=null)return true;
        }
        return false;

    }
}
class Solution {
    public static int findMaxDiameter(List<Integer> list[],int max[],int curr,int prev){
        int fmax=0;
        int smax=0;
        for(int i=0;i<list[curr].size();i++){
            if(list[curr].get(i)!=prev){
                int val=findMaxDiameter(list,max,list[curr].get(i),curr);
                if(fmax<val){
                    smax=fmax;
                    fmax=val;
                }else if(val>smax){
                    smax=val;
                }
            }
        }
        max[0] = max[0] > fmax + smax ? max[0] : fmax + smax;
        return fmax+1;
    }
    public int minimumDiameterAfterMerge(int[][] edge1, int[][] edge2) {
        List<Integer> list1[]=new List[edge1.length+1];
        List<Integer> list2[]=new List[edge2.length+1];
        for(int i =0;i<list1.length;i++){
            list1[i]=new ArrayList();
        }
        for(int i =0;i<list2.length;i++){
            list2[i]=new ArrayList();
        }

        for(int i=0;i<edge1.length;i++){
            list1[edge1[i][0]].add(edge1[i][1]);
            list1[edge1[i][1]].add(edge1[i][0]);
        }
        for(int i=0;i<edge2.length;i++){
            list2[edge2[i][0]].add(edge2[i][1]);
            list2[edge2[i][1]].add(edge2[i][0]);
        }
        
        // for(List<Integer> l:list1){
        //     System.out.println(l);
        // }
        // System.out.println();
        // for(List<Integer> l:list2){
        //     System.out.println(l);
        // }
        int max1[]=new int[1];
        max1[0]=0;
        int max2[]=new int[1];
        max2[0]=0;
        findMaxDiameter(list1,max1,0,-1);
        findMaxDiameter(list2,max2,0,-1);
        //System.out.println(max2[0]+" "+max1[0]);
        return Math.max(max2[0],Math.max((max1[0]+1)/2 + (max2[0]+1)/2 + 1,max1[0]));
    }
}
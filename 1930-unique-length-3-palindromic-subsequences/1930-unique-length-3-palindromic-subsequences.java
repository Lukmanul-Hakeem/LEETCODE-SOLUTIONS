class Solution {
    public int countPalindromicSubsequence(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // int prefixSum[]=new int[s.length()];
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     if(map.get(s.charAt(i))==null)count++;
        //     prefixSum[i]=count;
        //     map.put(s.charAt(i),i);
        // }
        // // for(int i : prefixSum)
        // // System.out.println(map.get('a'));
        // int ans=0;
        // int lastindex=0;
        // boolean visited[]=new boolean[26];
        // for(int i=0;i<26;i++)visited[i]=false;
        // for(int i=0;i<s.length()-2;i++){
        //     if(!visited[s.charAt(i)-'a']){
        //         visited[s.charAt(i)-'a']=true;
        //         lastindex=map.get(s.charAt(i));
        //         if(lastindex!=i+1 && lastindex!=i){
        //             ans+=(prefixSum[lastindex]-( i==0 ? 0 : prefixSum[i-1]));
        //             System.out.println(i+" "+(prefixSum[lastindex]-( i==0 ? 0 : prefixSum[i-1])));
        //         }
        //     }
        // }
        // return ans;



        int first=-1;
        int last=-1;
        int ans=0;
        for(char ch='a';ch<='z';ch++){
            last=first=-1;
            for(int i=0;i<s.length();i++){
                if(first==-1 && ch == s.charAt(i)){
                    first=i;
                }
                if(ch == s.charAt(i))last=i;
            }

            HashSet<Character> set = new HashSet<>();
            for(int i=first+1;i<last;i++){
                set.add(s.charAt(i));
            }
            ans+=set.size();

        }

        return ans;





    }
}
class Solution {
    public void find(String digits,StringBuilder sb,List<String> result,int index,HashMap<Character,String> map){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }

        String str = map.get(digits.charAt(index));
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            find(digits,sb,result,index+1,map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)return new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> result = new ArrayList<>();
        StringBuilder stb = new StringBuilder("");
        find(digits,stb,result,0,map);
        return result;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int f: map.values()){
            if(f!=0){
                return false;
            }
        }
        return true;

    }
}
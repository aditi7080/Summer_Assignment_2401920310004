class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch: magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch: ransomNote.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);

            if(map.get(ch)<0)
            {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        List<Integer> ans =new ArrayList<>();
        if(m>n){
            return ans;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(char ch: p.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<m;i++){
            char c=s.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map1.equals(map2)){
            ans.add(0);
        }
        for(int i=m;i<n;i++){
            char a=s.charAt(i);
            map2.put(a,map2.getOrDefault(a,0)+1);

            char r= s.charAt(i-m);
            map2.put(r,map2.get(r)-1);

            if(map2.get(r)==0){
                map2.remove(r);
            }
            if(map1.equals(map2)){
                ans.add(i-m+1);
            }
        }
        return ans;

    }
}
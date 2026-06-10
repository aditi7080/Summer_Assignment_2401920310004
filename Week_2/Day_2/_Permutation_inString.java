class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        if(n>m){
            return false;
        }
        HashMap <Character,Integer> map1=new HashMap<>();
        HashMap <Character,Integer> map2=new HashMap<>();
        for(char ch: s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        //sliding window
        for(int i=n;i<m;i++){
            char a=s2.charAt(i);
            map2.put(a,map2.getOrDefault(a,0)+1);

            char r=s2.charAt(i-n);
            map2.put(r,map2.get(r)-1);

            if(map2.get(r)==0){
                map2.remove(r);
            }
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}
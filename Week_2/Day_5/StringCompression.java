class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int idx=0;

        while(i<n){
            char ch=chars[i];
            int cnt=0;

            while(i<n && ch == chars[i]){
                i++;
                cnt++;
            }
            chars[idx++]=ch;

            if(cnt>1){
                for(char c: String.valueOf(cnt).toCharArray()){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}
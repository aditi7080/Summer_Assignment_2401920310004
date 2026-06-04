class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> arr=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;

        int fr=0; int lr=n-1;
        int fc=0; int lc=m-1;

        while(fr<=lr&& fc<=lc){
            for(int i=fc;i<=lc;i++){
                arr.add(matrix[fr][i]);
            }
            fr++;
            for(int j=fr;j<=lr;j++){
                arr.add(matrix[j][lc]);
            }
            lc--;

            if(fr<=lr){
                for(int k=lc;k>=fc;k--){
                    arr.add(matrix[lr][k]);
                }

                lr--;
            }
            if(fc<=lc){
                for(int r=lr;r>=fr;r--){
                    arr.add(matrix[r][fc]);
                }


                fc++;
            }
        }
        return arr;
    }
}
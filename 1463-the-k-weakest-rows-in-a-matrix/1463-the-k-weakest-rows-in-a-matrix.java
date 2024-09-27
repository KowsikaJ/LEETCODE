class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> al=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            int stro=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    stro++;
                }
                else{
                    break;
                }
            }
            al.add(new int []{stro,i});
    
        }
        Collections.sort(al,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            else{
                return a[1]-b[1];
            }
        });

        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=al.get(i)[1];
        }
        return res;
    
    }
}

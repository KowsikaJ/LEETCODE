class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] r=new int[code.length];
        if(k==0){
            return r;
        }
        for(int i=0;i<code.length;i++){
            if(k>0){
                for(int j=i+1;j<i+k+1;j++){
                    r[i]+=code[j%code.length];
                }
            }
            else{
                for(int j=i-1;j>i+k-1;j--){
                    r[i]+=code[(j+code.length)%code.length];
                }
            }
        }
        return r;
        
    }
}
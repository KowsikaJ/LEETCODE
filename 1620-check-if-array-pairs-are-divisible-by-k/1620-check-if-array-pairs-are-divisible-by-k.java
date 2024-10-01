class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] f=new int[k];
        for(int n:arr){
            int r=n%k;
            if(r<0){
                r=r+k;
            }
            f[r]++;
        }
        if(f[0]%2!=0){
            return false;
        }
        for(int i=1;i<=k/2;i++){
            if(f[i]!=f[k-i]){
                return false;
            }
        }
        return true;
    }
}
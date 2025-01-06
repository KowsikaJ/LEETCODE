class Solution {
    public int[] minOperations(String boxes) {
        int n =boxes.length();
        int[] res=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    c+=Math.abs(j-i);
                }
            }
            res[i]=c;
            c=0;
        }
        return res;
        
    }
}
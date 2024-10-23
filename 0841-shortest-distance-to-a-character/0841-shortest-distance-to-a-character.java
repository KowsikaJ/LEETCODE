class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] ar=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                char ch=s.charAt(j);
                if(ch==c){
                    int a=Math.abs(i-j);
                    min=Math.min(min,a);
                }
            }
            ar[i]=min;
        }
        return ar;
    }
}
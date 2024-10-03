class Solution {
    public void reverse(char[] st,int i,int j){
        while(i<j){
            char t=st[i];
            st[i]=st[j];
            st[j]=t;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] st=s.toCharArray();
        int i=0;
        int n=s.length();
        while(i<n){
            int j=Math.min(i+k-1,n-1);
            reverse(st,i,j);
            i+=2*k;
        }
    return new String(st);
        
    }
}
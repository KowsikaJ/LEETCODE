class Solution {
    public boolean canBeValid(String s, String locked) {
        int unlock1=0,unlock2=0,open=0,close=0,n;
        n=s.length();
        if(n%2!=0) return false;
        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0') unlock1++;
            else if(s.charAt(i)=='(') open++;
            else if(s.charAt(i)==')') open--;

            if(open+unlock1<0) return false;

            int j=n-i-1;

            if(locked.charAt(j)=='0') unlock2++;
            else if(s.charAt(j)==')') close++;
            else if(s.charAt(j)=='(') close--;

            if(close+unlock2<0) return false;
        }
        return true; 
    
    }
}
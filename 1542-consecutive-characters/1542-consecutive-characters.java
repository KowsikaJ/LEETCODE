class Solution {
    public int maxPower(String s) {
        int c=1,max=0;
        char ch=s.charAt(0);
        if(s.length()==1) return 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=ch){
                c=1;
                ch=s.charAt(i);
            }
            else{
                c++;
            }
            max=Math.max(max,c);
        }
        return max;
        
    }
}
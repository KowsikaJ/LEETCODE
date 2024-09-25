class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] str=new int[200];
        int[] tarr=new int[200];

        int len=s.length();

        if(len!=t.length()){
            return false;
        }
        for(int i=0;i<len;i++){
            if(str[s.charAt(i)]!=tarr[t.charAt(i)]){
                return false;
            }
            str[s.charAt(i)]=i+1;
            tarr[t.charAt(i)]=i+1;
        }
        return true;
        
    }
}
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r1="";
        for(int i=0;i<word1.length;i++){
            r1+=word1[i];
        }
        String r2="";
        for(int i=0;i<word2.length;i++){
            r2+=word2[i];
        }
        if(r1.equals(r2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
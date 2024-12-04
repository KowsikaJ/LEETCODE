class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int tarind=0,tarlen=str2.length();

        for(char c:str1.toCharArray()){
            if(tarind<tarlen && (str2.charAt(tarind)-c+26)%26 <=1){
                tarind++;

            }
            
        }
        return tarind==tarlen;
        
    }
}
class Solution {
    public String clearDigits(String s) {
        int i=0;
        String alpha="";

        while(i<=s.length()-1){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                alpha+=ch;
            }
            else{
                alpha=alpha.substring(0,alpha.length()-1);
            }
            i++;

        }
        return alpha;
        
    }
}
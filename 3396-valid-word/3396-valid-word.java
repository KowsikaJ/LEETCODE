class Solution {
    public boolean isValid(String word) {
        int v=0,c=0;
        if(word.length()<3){
            return false;
        }
        else{
            for(char ch:word.toCharArray()){
                if(Character.isLetter(ch)){
                    if("aeiouAEIOU".indexOf(ch)!=-1){
                        v++;
                    }
                    else{
                        c++;
                    }
                }
                else if(!Character.isDigit(ch)){
                    return false;
                }
            }
        }
        return v>=1 && c>=1;
        
    }
}
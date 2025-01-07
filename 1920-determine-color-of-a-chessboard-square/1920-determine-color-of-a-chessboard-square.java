class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ro=coordinates.charAt(1);
        char co=coordinates.charAt(0); //a b c...

        if(co=='a' || co=='c' || co=='e' || co=='g'){
            if(ro=='2' || ro=='4' || ro=='6' || ro=='8'){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(ro=='2' || ro=='4' || ro=='6' || ro=='8'){
                return false;
            }
            else{
                return true;
            }

        }
        
    }
}
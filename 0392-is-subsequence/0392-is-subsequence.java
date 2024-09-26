/*class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int c=0;
        int j=0;
        if(s.length()==0){
            return true;
        }

        while(i<t.length()){
            if(t.charAt(i)!=s.charAt(j)){
                i++;
            }
            else{
                c++;
                i++;
                j++;
                if(c==s.length())return true;

            }
        }
        
        return false;
        
    }
}
*/


class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        if(s.length()==0){
            return true;
        }
        
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            if(j==s.length())return true;  
        }
        return false;
    }
}

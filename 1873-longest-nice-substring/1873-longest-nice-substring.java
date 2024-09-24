class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2){
            return "";
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(Character.toLowerCase(ch))==-1 || s.indexOf(Character.toUpperCase(ch))==-1){
                String l=longestNiceSubstring(s.substring(0,i));
                String r=longestNiceSubstring(s.substring(i+1));
                return l.length()>=r.length()?l:r;

            }
        }
        return s;
    }
}















        /*if (s.length() < 2) {
            return "";  // A string of length < 2 can't be "nice"
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(Character.toLowerCase(ch)) == -1 || s.indexOf(Character.toUpperCase(ch)) == -1) {
                // Split around the current character and check both parts
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                return left.length() >= right.length() ? left : right;
            }
        }
        return s;  // If all characters have both upper and lower cases
        */
   
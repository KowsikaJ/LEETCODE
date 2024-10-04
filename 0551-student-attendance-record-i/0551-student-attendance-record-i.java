class Solution {
    public boolean checkRecord(String s) {
        /*if(s.contains("LLL")){
            return false;
        }
        if(s.indexOf('A')!=s.lastIndexOf('A')){
            return false;
        }
        return true;
        */
        int n=s.length()-1;
        int p=0,l=0,a=0;
        
        int aCount = 0; 
        int lCount = 0; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                aCount++;
                if (aCount > 1) {
                    return false;
                }
            }
            if (ch == 'L') {
                lCount++;
                if (lCount > 2) {
                    return false;
                }
            } else {
                lCount = 0;
            }
        }

        return true; 
    }
}
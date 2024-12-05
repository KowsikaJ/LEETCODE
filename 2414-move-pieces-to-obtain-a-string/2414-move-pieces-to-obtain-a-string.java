//onlu 121 testcases passed
/*class Solution {
    public boolean canChange(String start, String target) {
        String st="",tar="";

        for(int i=0;i<start.length();i++){
            if(start.charAt(i)!='_'){
                st+=start.charAt(i);
            }
        }
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!='_'){
                tar+=target.charAt(i);
            }
        }
        return st.equals(tar);

        
    }
}*/



class Solution {
    public boolean canChange(String start, String target) {
        if (start.equals(target)) {
            return true;
        }
        int waitL = 0;
        int waitR = 0;
        
        for (int i = 0; i < start.length(); i++) {
            char curr = start.charAt(i);
            char goal = target.charAt(i);
            
            if (curr == 'R') {
                if (waitL > 0) {
                    return false;
                }
                waitR++;
            }
            if (goal == 'L') {
                if (waitR > 0) {
                    return false;
                }
                waitL++;
            }
            if (goal == 'R') {
                if (waitR == 0) {
                    return false;
                }
                waitR--;
            }
            if (curr == 'L') {
                if (waitL == 0) {
                    return false;
                }
                waitL--;
            }
        }
        
        return waitL == 0 && waitR == 0;
    }
}
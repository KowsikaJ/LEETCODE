class Solution {
    public boolean buddyStrings(String s, String goal) {
        int slen=s.length(),glen=goal.length();
        if(slen!=glen){
            return false;
        }
        int c=0;
        for(int i=0;i<slen;i++){
            if(s.charAt(i)!=goal.charAt(i)){
                c++;
            }
        }
        int[] a=new int[26];
        int[] b=new int[26];
        if(c>2){
            return false;
        }
        for(int i=0;i<slen;i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<glen;i++){
            b[goal.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        if(c==2)return true;

        for(int i=0;i<26;i++){
            if(a[i]>=2){
                return true;
            }
        }
        return false;
        
    }
}
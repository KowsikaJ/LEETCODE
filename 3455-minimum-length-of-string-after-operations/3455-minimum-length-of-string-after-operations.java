class Solution {
    public int minimumLength(String s) {
        if(s.length()<3) return s.length();

        char[] freq=new char[26];
        int total=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch:freq){
            if(ch==0) continue;
            else if(ch%2==0) total+=2;
            else total+=1;
        }
        return total;
        
    }
}
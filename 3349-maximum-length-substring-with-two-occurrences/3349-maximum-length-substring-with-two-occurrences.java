class Solution {
    public int maximumLengthSubstring(String s) {
        int start=0,end=0,max=0;
        char[] freq=new char[26];
        while(end<s.length()){
            freq[s.charAt(end)-'a']++;
            if(freq[s.charAt(end)-'a']>2){
                while(freq[s.charAt(end)-'a']>2){
                    freq[s.charAt(start)-'a']--;
                    start++;
                }   
            }
            max=Math.max(max,end-start+1);
            end++;
        }
        return max;   
    }
}
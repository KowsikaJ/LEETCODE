class Solution {
    public String removeDuplicates(String s) {
        char[] stack=new char[s.length()];
        int stacktop=0;
        for(int i=0;i<s.length();i++)
        {
            if(stacktop>0 && stack[stacktop-1]==s.charAt(i)){
                stacktop--;
            }
            else{
                stack[stacktop]=s.charAt(i);
                stacktop++;
            }
        }
        return new String(stack,0,stacktop);
    }
}
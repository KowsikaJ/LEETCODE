class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder st=new StringBuilder();

        for(String word:words){
            String rev=new StringBuilder(word).reverse().toString();
            st.append(rev).append(" ");
        }
        return st.toString().trim();
        
    }
}
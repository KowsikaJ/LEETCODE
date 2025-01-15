class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] ans=new String[words.length];
        for(int i=0;i<words.length;i++){
            int le=words[i].length();
            String st=words[i];
            int ind=st.charAt(le-1)-'0';
            String newst=st.substring(0,st.length()-1);
            ans[ind-1]=newst;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            sb.append(ans[i]+" ");
        }
        return sb.toString().trim();

        
    }
}
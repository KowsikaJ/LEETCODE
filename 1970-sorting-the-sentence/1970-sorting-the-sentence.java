class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] ans=new String[words.length];
       
        for(String st:words){
            int ind=st.charAt(st.length()-1)-'0';
            ans[ind-1]=st.substring(0,st.length()-1);

        }
        int i=0;
        StringBuilder sb=new StringBuilder();
        for(i=0;i<ans.length-1;i++){
            sb.append(ans[i]).append(" ");
        }
        sb.append(ans[i]);
        return sb.toString();

        
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }
    public String compare(String st){
        StringBuilder sb=new StringBuilder();
        char[] c=st.toCharArray();

        for(int i=0;i<c.length;i++){
            if(c[i]=='#' && sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
                continue;
            }
            if(c[i]!='#'){
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
}
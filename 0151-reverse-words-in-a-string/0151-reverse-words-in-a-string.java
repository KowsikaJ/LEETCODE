class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] starr=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=starr.length-1;i>=0;i--){
            sb.append(starr[i]+" ");
        }
        return sb.toString().trim();
        
    }
}
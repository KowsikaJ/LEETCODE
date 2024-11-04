class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int c=1;
        char ch=word.charAt(0);
        for(int i=1;i<word.length();i++){
            if(ch==word.charAt(i) && c<9){
                c++;
            }
            else{
                sb.append(c).append(ch);
                ch=word.charAt(i);
                c=1;
            }

        }
        sb.append(c).append(ch);
        return sb.toString();
        
    }
}
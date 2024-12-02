class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] l=sentence.split(" ");
        for(int i=0;i<l.length;i++){
            for(int j=0;j<l[i].length();j++){
                if(l[i].substring(0,j+1).equals(searchWord)){
                    return i+1;
                }
            }
        }
        return -1;
        
    }
}
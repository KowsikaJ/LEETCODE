class Solution {
    public int mostWordsFound(String[] sentences) {
        int min=Integer.MIN_VALUE;
        int c;
        for(String sent:sentences){
            c=0;
            for(int i=0;i<sent.length();i++){
                if(sent.charAt(i)==' '){
                    c++;
                }
            }
            if(c+1>min){
                min=c+1;
            }
        }
        return min;
        
    }
}
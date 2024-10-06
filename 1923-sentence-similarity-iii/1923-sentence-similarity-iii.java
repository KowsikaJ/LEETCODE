class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1=sentence1.split(" ");
        String[] words2=sentence2.split(" ");
        
        if(sentence1.length()<sentence2.length()){
            String[] t=words1;
            words1=words2;
            words2=t;
        }
        int n1=words1.length;
        int n2=words2.length;
        int s=0,e=0;
        while(s<n2 && words1[s].equals(words2[s])){
            s++;
        }
        while(e<n2 && words1[n1-1-e].equals(words2[n2-1-e])){
            e++;
        }
    
        return s+e>=n2;
    }

}
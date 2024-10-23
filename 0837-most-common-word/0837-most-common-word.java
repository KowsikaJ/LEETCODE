class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
       HashMap<String,Integer> m=new HashMap<>();
       String mod=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
       String[] words=mod.split(" ");
       for(String word: words){
        if(word.length()>0){
            m.put(word,m.getOrDefault(word,0)+1);
        }
       }
       for(String ban:banned){
        if(m.containsKey(ban)){
            m.remove(ban);
        }
       }
       String ans="";
       int max=0;
       for(String word:m.keySet()){
        int count=m.get(word);
        if(count>max){
            max=count;
            ans=word;
        }
       }
       return ans;
    }
}
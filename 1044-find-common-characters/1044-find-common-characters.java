class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list=new ArrayList<>();
        Map<Character,Integer> map=freqmap(words[0]);
        for(int i=1;i<words.length;i++){
            Map<Character,Integer> curr=freqmap(words[i]);

            for(char ch:map.keySet()){
                if(curr.containsKey(ch)){
                    map.put(ch,Math.min(map.get(ch),curr.get(ch)));
                }
                else{
                    map.put(ch,0);
                }
            }
        }
        for(char ch:map.keySet()){
            int count=map.get(ch);
            for(int i=0;i<count;i++){
                list.add(String.valueOf(ch));
            }
            
        }
        return list;
        
            
        }
        public Map<Character,Integer> freqmap(String word){
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<word.length();i++){
                map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
            }
            return map;
        }
       
}


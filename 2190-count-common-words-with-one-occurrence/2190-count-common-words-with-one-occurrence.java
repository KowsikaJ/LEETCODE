class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> m1=new HashMap<>();
        for(String s:words1){
            m1.put(s,m1.getOrDefault(s,0)+1);
        }
        HashMap<String,Integer> m2=new HashMap<>();
        for(String s:words2){
            m2.put(s,m2.getOrDefault(s,0)+1);
        }

        List<String> l=new ArrayList<>();
        for(Map.Entry<String,Integer> m:m1.entrySet()){
            if(m.getValue()==1){
                l.add(m.getKey());
            }
        }
        int ans=0;
        for(Map.Entry<String,Integer> map:m2.entrySet()){
            if(map.getValue()==1 && l.contains(map.getKey())){
                ans++;

            }
        }
        return ans;

        
    }
}
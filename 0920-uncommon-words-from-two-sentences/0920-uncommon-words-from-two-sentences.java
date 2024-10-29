class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> m1=new HashMap<>();
        HashMap<String,Integer> m2=new HashMap<>();
        for(String w:s1.split(" ")){
            m1.put(w,m1.getOrDefault(w,0)+1);
        }
        for(String w:s2.split(" ")){
            m2.put(w,m2.getOrDefault(w,0)+1);
        }
        ArrayList<String> l=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:m1.entrySet()){
            String key=entry.getKey();
            int val=entry.getValue();
            if(val==1 && !m2.containsKey(key)){
                l.add(key);
            }

        }
        for(Map.Entry<String,Integer> entry:m2.entrySet()){
            String key=entry.getKey();
            int val=entry.getValue();
            if(val==1 && !m1.containsKey(key)){
                l.add(key);
            }

        }

        return l.toArray(new String[0]);
        
    }
}
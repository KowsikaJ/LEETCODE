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

//using only one hashmap
/*
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>m=new HashMap<>();
        String sa1[]=s1.split(" "),sa2[]=s2.split(" ");
        for(String c:sa1)
         m.put(c, m.getOrDefault(c, 0) + 1);
        for(String c:sa2)
         m.put(c, m.getOrDefault(c, 0) + 1);
       ArrayList<String> a = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                a.add(entry.getKey());
            }
        }
        String ans[]=new String[a.size()];
        int l=0;
        for(String c:a)
        ans[l++]=c;
        return ans;
    }
}
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();

        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String ns=new String(ch);

            if(!m.containsKey(ns)){
                m.put(ns,new ArrayList<>());
            }
            m.get(ns).add(s);
        }
        return new ArrayList<>(m.values());
        
    }
}
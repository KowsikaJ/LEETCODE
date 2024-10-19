class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:stones.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int co=0;
        for(char c:jewels.toCharArray()){
            if(m.containsKey(c)){
                co=co+m.get(c);

            }
        }
        return co;
        
    }
}
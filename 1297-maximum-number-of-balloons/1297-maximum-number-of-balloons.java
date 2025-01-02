class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> m=new HashMap<>();
        m.put('b',0);
        m.put('a',0);
        m.put('l',0);
        m.put('o',0);
        m.put('n',0);

        for(int i=0;i<text.length();i++){
            if(m.containsKey(text.charAt(i))){
                m.put(text.charAt(i),m.get(text.charAt(i))+1);
            }

        }
        m.put('l',m.get('l')/2);
        m.put('o',m.get('o')/2);

        int res=10000;
        for(char key:m.keySet()){
            if(m.get(key)<res){
                res=m.get(key);
            }
            
        }
        return res;

        
    }
}
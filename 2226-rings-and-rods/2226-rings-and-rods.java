class Solution {
    public int countPoints(String rings) {
        Set<Integer> r=new HashSet<>(),g=new HashSet<>(),b=new HashSet<>();

        for(int i=0;i<rings.length();i=i+2){
            if(rings.charAt(i)=='R'){
                r.add(rings.charAt(i+1)-'0');
            }
            else if(rings.charAt(i)=='G'){
                g.add(rings.charAt(i+1)-'0');
            }
            else{
                b.add(rings.charAt(i+1)-'0');
            }
        }
        int c=0;
        for(int i=0;i<=9;i++){
            if(r.contains(i) && g.contains(i) && b.contains(i)){
                c++;
            }
        }
        return c;
        
    }
}
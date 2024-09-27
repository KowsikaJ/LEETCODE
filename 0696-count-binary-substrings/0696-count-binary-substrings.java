class Solution {
    public int countBinarySubstrings(String s) {
        /*int cur = 1, pre = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            else {
                res += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
        */

        List<Integer> l=new ArrayList<>();
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                l.add(c);
                c=1;
            }
        }
        l.add(c);
        int r=0;
        for(int i=1;i<l.size();i++){
            r+=Math.min(l.get(i-1),l.get(i));
        }
        return r;


        
    }
}
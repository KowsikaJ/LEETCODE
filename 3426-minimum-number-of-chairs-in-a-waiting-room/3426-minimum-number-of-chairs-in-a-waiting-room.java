class Solution {
    public int minimumChairs(String s) {
        int co=0,res=0;
        for(char ch:s.toCharArray()){
            if(ch=='E') co++;
            else co--;

            res=Math.max(res,co);
        }
        return res;
        
    }
}
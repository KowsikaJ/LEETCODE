class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(0,s,new HashSet<>());    
    }
    private int backtrack(int st,String s,HashSet<String> seen){
        if(st==s.length()){
            return 0;
        }
        int maxsplit=0;
        for(int e=st+1;e<=s.length();e++){
            String substring=s.substring(st,e);
            if(!seen.contains(substring)){
                seen.add(substring);
                maxsplit=Math.max(maxsplit,1+backtrack(e,s,seen));
                seen.remove(substring);
            }
        }
        return maxsplit;
    }
}
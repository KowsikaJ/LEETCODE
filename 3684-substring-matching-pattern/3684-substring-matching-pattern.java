class Solution {
    public boolean hasMatch(String s, String p) {
        int index=p.indexOf('*');
        int first=s.indexOf(p.substring(0,index));
        int last=s.indexOf(p.substring(index+1),first+index);
        if(first!=-1 && last!=-1) return true;

        return false;
        
    }
}
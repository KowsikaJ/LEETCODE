class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        int res=0;
        Set<Character> uniq=new HashSet<>();
        for(int i=0;i<n;i++){
            uniq.add(s.charAt(i));
        }

        for(char letter:uniq){
            int left=-1;
            int rig=-1;

            for(int i=0;i<n;i++){
                if(letter==s.charAt(i)){
                    if(left==-1){
                        left=i;
                    }
                    rig=i;
                }
            }
            if(left!=-1 && rig!=-1 && left<rig-1){
                Set<Character> count=new HashSet<>();
                for(int j=left+1;j<rig;j++){
                    count.add(s.charAt(j));
                }
                res+=count.size();
            }
        }
        return res;  
    }
}
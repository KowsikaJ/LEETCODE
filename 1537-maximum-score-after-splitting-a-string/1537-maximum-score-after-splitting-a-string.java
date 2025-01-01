class Solution {
    public int maxScore(String s) {
        int zero=0,ones=0,maxscore=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }

        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else{
                ones--;
            }
            maxscore=Math.max(maxscore,ones+zero);
        }
        return maxscore;
        
    }
}
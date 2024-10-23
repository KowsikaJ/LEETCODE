class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines=1,sum=0;
        for(char ch:s.toCharArray()){
            int ind=ch-'a';
            if(sum + widths[ind]>100){
                lines++;
                sum=0;
            }
            sum+=widths[ind];
        }
        return new int[]{lines,sum};
        
    }
    
}
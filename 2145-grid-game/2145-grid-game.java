class Solution {
    public long gridGame(int[][] grid) {
        long topsum=0,botsum=0,minimum=Long.MAX_VALUE;
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            topsum+=grid[0][i];
        }
        for(int p=0;p<n;p++){
            topsum-=grid[0][p];
            minimum=Math.min(minimum,Math.max(topsum,botsum));
            botsum+=grid[1][p];
        }
        return minimum;
        
    }
}
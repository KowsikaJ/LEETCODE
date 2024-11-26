class Solution {
    public int findChampion(int n, int[][] edges) {
        boolean[] isdefeated=new boolean[n];
        Arrays.fill(isdefeated,true);

        for(int[] edge:edges){
            int win=edge[0];
            int lose=edge[1];
            isdefeated[lose]=false;

        }
        int champion=-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(isdefeated[i]){
                champion=i;
                count++;
            }
        }
        return count==1?champion:-1;
        
    }
}
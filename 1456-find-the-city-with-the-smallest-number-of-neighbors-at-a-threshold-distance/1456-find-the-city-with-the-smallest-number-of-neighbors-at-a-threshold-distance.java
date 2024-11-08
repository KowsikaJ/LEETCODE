class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] distance=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(distance[i],1000000000);
            distance[i][i]=0;
        }
        for(int[] edge:edges){
            distance[edge[0]][edge[1]]=edge[2];
            distance[edge[1]][edge[0]]=edge[2];
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    distance[i][j]=Math.min(distance[i][j],distance[i][k]+distance[k][j]);
                }
                
            }
        }

        int ans=-1;
        int min=Integer.MAX_VALUE;
        //int[] reach=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(distance[i][j]<=distanceThreshold){
                    c++;

                }
            }
            //reach[i]=c;
            if(c<=min){
                min=c;
                ans=i;
            }
        }
        return ans;
        
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++)   {
            for(int j=0;j<c;j++){
                if(target==matrix[i][j]){
                    return true;
                }
            }
        } 
        return false;
        */
        int r=matrix.length;
        int c=matrix[0].length;
        int le=0;
        int ri=r*c-1;
        while(le<=ri){
            int mid=(le+ri)/2;
            int row=mid/c;
            int col=mid%c;
            int guess=matrix[row][col];

            if(target==guess){
                return true;
            }
            else if(target>guess){
                le=mid+1;
            }
            else{
                ri=mid-1;
            }
        }
        return false;
    }
}
        

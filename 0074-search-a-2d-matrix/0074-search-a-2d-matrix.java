class Solution {
    public static boolean binarySearch(int[] array,int target){
        int left = 0;
        int right = array.length-1;
        int mid = left+(right-left)/2;
        while(left<=right){
            mid=left+(right-left)/2;
            if(target==array[mid])
                return true;
            else if(target<array[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        boolean flag=false;
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                return binarySearch(matrix[i],target);
            }
        }
        return flag;
    }
}
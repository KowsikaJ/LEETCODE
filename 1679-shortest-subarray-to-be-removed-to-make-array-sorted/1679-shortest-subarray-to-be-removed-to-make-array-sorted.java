class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;
        int r=n-1;
        while(r>0 && arr[r-1]<=arr[r]){
            r--;
        }

        if(r==0){
            return 0;
        }
        int min=r;
        for(int l=0;l<n;l++){
            if(l>0 && arr[l-1]>arr[l]){
                break;
            }
            while(r<n && arr[l]>arr[r]){
                r++;
            }
            int curr=r-l-1;
            min=Math.min(min,curr);
           

        }
        return min;
        
    }
}
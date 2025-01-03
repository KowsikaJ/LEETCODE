class Solution {
    public int waysToSplitArray(int[] nums) {
        long s=0,n=nums.length;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        long sum=0;
        int c=0;
        for(int i=0;i<n-1;i++){
            sum+=nums[i];
            if(sum>=s-sum){
                c++;
            }

        }
        return c;
        
    }
}
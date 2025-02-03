class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }

        int incre=1;
        int decre=1;
        int maxi=1;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                incre++;
                decre=1;
            }
            else if(nums[i]<nums[i-1]){
                decre++;
                incre=1;
            }
            else{
                incre=1;
                decre=1;
            }
            maxi=Math.max(maxi,Math.max(incre,decre));

        }
        return maxi;

        
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int start=0;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            while(s>=target){
                ans=Math.min(ans,i-start+1);
                s-=nums[start];
                start++;
            }
            

        }
        return ans==Integer.MAX_VALUE?0:ans;
        
    }
}

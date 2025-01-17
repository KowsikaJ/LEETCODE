class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1) return 1;
        int c=1,max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                c++;
            }
            else if(nums[i]>=nums[i+1]){
                c=1;
            }
            max=Math.max(max,c);
            
        }
        return  Math.max(max,c);
        
    }
}
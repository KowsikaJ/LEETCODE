public class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n= nums.length;
        int[] leftdp=new int[n];
        int[] rightdp=new int[n];
        Arrays.fill(leftdp,1);
        Arrays.fill(rightdp,1);

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    leftdp[i]=Math.max(leftdp[i],leftdp[j]+1);
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(nums[i]>nums[j]){
                    rightdp[i]=Math.max(rightdp[i],rightdp[j]+1);
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(leftdp[i]!=1 && rightdp[i]!=1){
                ans=Math.max(ans,leftdp[i]+rightdp[i]);
            }
        }
        return n-ans+1;
        
    }
}
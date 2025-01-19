class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length,zero=0,ones=0,two=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                ones++;
            }
            else{
                two++;
            }
        }
        int k=0;
        for(int i=0;i<zero;i++){
            nums[k++]=0;
        }
        for(int i=k+1;i<=zero+ones;i++){
            nums[k++]=1;
        }
        for(int i=k+1;i<=n;i++){
            nums[k++]=2;
        }
        
    }
}
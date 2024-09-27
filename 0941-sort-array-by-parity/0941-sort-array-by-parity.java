class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=0;
        int[] nu=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nu[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                nu[k]=nums[i];
                k++;
            }
        }
        return nu;
        
    }
}
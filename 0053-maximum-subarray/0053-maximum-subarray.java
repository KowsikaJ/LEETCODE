class Solution {
    public int maxSubArray(int[] nums) {
        //KADANE ALGORITHM
        /*int max=Integer.MIN_VALUE,s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(s>max){
                max=s;
            }
            if(s<0){
                s=0;
            }
        }
        return max;
        */
        //SLIDING WINDOW
        int globalsum=Integer.MIN_VALUE;
        int s=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum>globalsum){
                globalsum=sum;
            }
            while(sum<0){
                sum-=nums[s];
                s++;
            }

        }
        return globalsum;
        
    }
}
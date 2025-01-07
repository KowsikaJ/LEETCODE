class Solution {
    public int findNumbers(int[] nums) {
        int count=0,c=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(num>0){
                c++;
                num/=10;
            }
        
            if(c%2==0){
                count++;

            }
            c=0;
        }
        return count;
        
    }
}
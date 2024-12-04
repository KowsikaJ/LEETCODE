class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0,s=0,d=0,diff=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) { // First integer
            for (int j = i + 1; j < nums.length - 1; j++) { // Second integer
                for (int k = j + 1; k < nums.length; k++) { 
                    s=nums[i]+nums[j]+nums[k];
                    d=Math.abs(target-s);
                    if(d<=diff){
                        sum=s;
                        diff=d;
                    }

                }
            }
        }
        return sum;
        
    }
}
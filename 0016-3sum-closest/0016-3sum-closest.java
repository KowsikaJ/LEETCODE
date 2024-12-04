//brute force approach
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

/*class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - currentSum) < Math.abs(target - closest)) {
                        closest = currentSum;
                    }
                }
            }
        }

        return closest;
    }
}*/
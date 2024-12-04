//brute force approach
/*class Solution {
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
*/

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                if (currSum == target) {
                    return target;
                }

                if (Math.abs(currSum - target) < Math.abs(closest - target)) {
                    closest = currSum;
                }

                if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }
}
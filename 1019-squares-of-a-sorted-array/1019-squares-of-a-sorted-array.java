class Solution {
    public int[] sortedSquares(int[] nums) {
        /*int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(res);
        return res;
        */

        int n = nums.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
        
        
    }
}
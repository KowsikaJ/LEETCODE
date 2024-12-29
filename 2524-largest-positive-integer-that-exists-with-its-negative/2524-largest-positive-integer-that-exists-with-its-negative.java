class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int k:nums){
            s.add(k);
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            int nu=-(nums[i]);
            if(s.contains(nu)){
                return nums[i];
            }

        }
        return -1;
        
    }
}
class Solution {
    public int findMaxK(int[] nums) {
        /*Set<Integer> s=new HashSet<>();
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
        */
        
        HashSet<Integer> hs = new HashSet<>();
        int ans = -1;
        for(int num : nums){
            hs.add(num);
            int k = num*(-1);
            if(hs.contains(k)){
                ans = Math.max(ans,Math.abs(num));
            }
        }
        return ans;
    }
}
        
 
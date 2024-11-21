class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int res=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            if(m.get(nums[i])>max){
                max=m.get(nums[i]);
                res=nums[i];
            }

        }
        return res;
       
        
    }
}
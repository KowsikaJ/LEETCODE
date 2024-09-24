class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] r=new int[2];
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                r[0]=nums[i];

            }
            s.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)) r[1]=i;

        }

        
        return r;
    }
}
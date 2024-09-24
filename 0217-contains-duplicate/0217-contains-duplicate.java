class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        */

        /*Set<Integer> numset=new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }
        return numset.size()<nums.length;
        */

        Set<Integer> numset=new HashSet<>();
        for(int num:nums){
            if(!numset.add(num)){
                return true;
            }
        }
        return false;

    }
}
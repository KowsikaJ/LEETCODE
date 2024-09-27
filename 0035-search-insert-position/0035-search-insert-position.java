class Solution {
    public int searchInsert(int[] nums, int target) {
        /*for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
        }
    }
    return nums.length;
    */
    int l=0;
    int r=nums.length-1;
    while(l<=r) {
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            l=mid+1;
        }
        else{
            r=mid-1;
        }

    }
    return l;
    }
}
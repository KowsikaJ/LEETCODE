class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int left=binarysearch(nums,target,true);
        int right=binarysearch(nums,target,false);

        res[0]=left;
        res[1]=right;
        return res; 
    }
    public int binarysearch(int[] nums,int target,boolean searching){
        int left=0;
        int right=nums.length-1;
        int ind=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                ind=mid;
                if(searching){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }

        }
        return ind;
        
    }
}
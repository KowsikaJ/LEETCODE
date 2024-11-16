class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] arr=new int[nums.length-k+1];

        if(nums==null || nums.length<k){
            return new int[0];
        }

        int i=0,j=k-1,a=0;
        while(j<nums.length){
            if(solve(nums,i,j)){
                arr[a]=nums[j];
            }
            else{
                arr[a]=-1;
            }
            i++;
            j++;
            a++;
        }
        return arr;
    }
    public static boolean solve(int[] nums,int i,int j){
        for(int s=i;s<j;s++){
             if(nums[s]+1!=nums[s+1]){
            return false;
            }
    
        }
        return true;
    }
}
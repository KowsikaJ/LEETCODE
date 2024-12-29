class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=0,k=0,sum=0;
        int l=nums.length;
        for(i=0;i<l-2;i++){
            j=i+1;
            k=l-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }


            }
        }
        return new ArrayList<>(res);
    }
}


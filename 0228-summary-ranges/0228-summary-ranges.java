class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> l=new ArrayList<>();
        if(n==0)return l;

        int start=0;
        for(int end=1;end<=n;end++){
            if(end==n || nums[end]!=nums[end-1]+1){
                if(start==end-1){
                    l.add(String.valueOf(nums[start]));
                }
                else{
                    l.add(nums[start]+"->"+nums[end-1]);
                }
                start=end;
            }

        }
        return l;
        
    }
}
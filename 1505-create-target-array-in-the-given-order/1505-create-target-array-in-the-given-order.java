class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int[] res=new int[n];

        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }

        for(int i=0;i<n;i++){
            res[i]=l.get(i);
        }
        return res;
        
    }
}
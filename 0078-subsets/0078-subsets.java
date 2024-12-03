class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();

        createsubset(nums,0,res,subset);
        return res;

        
    }
    public void createsubset(int[] nums,int ind,List<List<Integer>> res,List<Integer> subset){
        if(ind==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[ind]);
        createsubset(nums,ind+1,res,subset);

        subset.remove(subset.size()-1);
        createsubset(nums,ind+1,res,subset);
    }
}
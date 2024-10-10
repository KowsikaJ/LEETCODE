class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        backtrack(1,l,res,n,k);
        return res;
    }
    private void backtrack(int start,List<Integer> l,List<List<Integer>> res,int n,int k){
        if(l.size()==k){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            l.add(i);
            backtrack(i+1,l,res,n,k);
            l.remove(l.size()-1);
        }
    }
}
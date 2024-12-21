class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> s=new HashSet<>();
        for(List<Integer> l:nums){
            int st=l.get(0);
            int end=l.get(1);
            for(int i=st;i<=end;i++){
                if(!s.contains(i)){
                    s.add(i);
                }
            }
        }
        return s.size();

        
    }
}
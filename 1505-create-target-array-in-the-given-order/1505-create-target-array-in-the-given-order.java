class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
        
    }
}
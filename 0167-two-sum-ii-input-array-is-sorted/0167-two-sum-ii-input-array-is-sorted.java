class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int n=numbers.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int com=target-numbers[i];
            if(m.containsKey(com)){
                res[0]=m.get(com)+1;
                res[1]=i+1;
                return res;
            }
            m.put(numbers[i],i);
        }
        return res;  
    }
}
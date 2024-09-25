class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int p=0;
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
            
            if(m.get(num)%2==0){
                p++;
            }
            
        }
        int[] l=new int[2];
        l[0]=p;
        l[1]=(nums.length - p * 2);

        return l;
        
    }
}
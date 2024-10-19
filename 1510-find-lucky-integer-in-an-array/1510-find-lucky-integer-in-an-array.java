class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:arr){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num==m.get(num)){
                if(num>max){
                    max=num;
                }
                
            }
            
        }
        return max==Integer.MIN_VALUE?-1:max;
        
    }
}
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int num:arr1){
            String s=Integer.toString(num);
            String p="";
            for(char ch:s.toCharArray()){
                p+=ch;
                map.put(p,map.getOrDefault(p,0)+1);
            }
        }
        int max=0;
        for(int num:arr2){
            String s2=Integer.toString(num);
            String p="";
            for(char ch:s2.toCharArray()){
                p+=ch;
                if(map.containsKey(p)){
                    max=Math.max(max,p.length());
                }
            }

        }
        return max;
        
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            l.add(nums[i]);
        }
        /*Arrays.sort(l,(a,b)->{
            if(map.get(b)!=map.get(a)){
                return map.get(a)-map.get(b);
            }
            else{
                return b-a;
            }
        });
        */
        
        l.sort((a, b) -> { // Use l.sort instead of Arrays.sort
            if (!map.get(a).equals(map.get(b))) { // Compare frequencies
                return map.get(a) - map.get(b); // Descending order of frequency
            } else {
                return b - a; // Ascending order of value
            }
        });

        for(int i=0;i<nums.length;i++){
            nums[i]=l.get(i);
        }
        return nums;
        
    }
}
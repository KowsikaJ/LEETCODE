class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
        for(int i=0;i<sorted.length;i++){
            m.put(sorted[i],i+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=m.get(arr[i]);
        }
        return arr;
        
    }
}
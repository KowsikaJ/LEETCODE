class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> minheap=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));

        for(int num:m.keySet()){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        int[] a=new int[k];
        for(int i=0;i<k;i++){
            a[i]=minheap.poll();
        }
        return a;
    }
}






















        /*Map<Integer,Integer> counts=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            counts.put(nums[i],counts.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> counts.get(a) - counts.get(b));
        
        for (int num: counts.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        
        return result;
        */
  
import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : m.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        int maxFrequencyCount = 0;
        for (int count : m.values()) {
            if (count == maxCount) {
                maxFrequencyCount++;
            }
        }
        
        return maxFrequencyCount*maxCount;
    }
}

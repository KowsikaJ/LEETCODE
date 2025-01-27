/*class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(original)) {
            original *= 2;
        }

        return original;
    }
}
*/
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        
        while (true) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (nums[i] == original) {
                    original *= 2;
                    found = true;
                    break;
                }
            }
            if (!found) {
                break;
            }
        }
        
        return original;
    }
}
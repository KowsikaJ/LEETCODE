class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);  
        
        int start = 1;
        int end = position[position.length - 1] - position[0];
        int r=0;
        while (start <= end) {
            int mid = start+(end - start) / 2;  // Midpoint of the current search space
            if (canPlaceBalls(position, mid, m)) {
                r=mid;
                start = mid + 1;  // If placing m balls with at least 'mid' distance is possible, try for a larger distance
            } else {
                end = mid - 1;  // Otherwise, try for a smaller distance
            }
        }
        
        return r;  // Step 5: The largest possible minimum distance
    }
    
    // Helper function to check if placing m balls with at least 'mid' distance is possible
    private boolean canPlaceBalls(int[] position, int mid, int m) {
        int count = 1;  // Place the first ball
        int lastPosition = position[0];
        
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= mid) {
                count++;
                lastPosition = position[i];
                if (count == m) {
                    return true;  // All m balls placed successfully
                }
            }
        }
        
        return false;  
        
    }
}
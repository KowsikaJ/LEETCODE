class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0; // Count of flowers we can place
        
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current spot is empty and both neighbors (if they exist) are empty
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) && // Check left neighbor
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { // Check right neighbor
                
                flowerbed[i] = 1; // Place a flower
                c++; // Increment count of placed flowers
                
                // Skip the next spot since we can't place flowers adjacent to each other
                i++;
            }
        }
        
        // Return true if we can place at least n flowers
        return c >= n;
    }
}

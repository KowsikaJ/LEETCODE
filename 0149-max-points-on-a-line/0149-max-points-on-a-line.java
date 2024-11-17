class Solution {
    public int maxPoints(int[][] points) {
        if (points.length == 1) return 1;  // Edge case: if there's only one point
        
        int n = points.length;
        int maxOverall = 0;  // Max points on a line overall

        for (int i = 0; i < n - 1; i++) {
            HashMap<Double, Integer> map = new HashMap<>();  // To track slope frequencies
            int max = 0;  // Max points on a line for current point i
            for (int j = i + 1; j < n; j++) {
                double slope;

                // Handle vertical lines (infinite slope)
                if (points[j][0] == points[i][0]) {
                    slope = Double.POSITIVE_INFINITY;
                } else if(points[j][1]==points[i][1]){
                    slope=0;
                } else{
                    // Calculate slope
                    slope = (double) (points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
                }

                // Update the frequency of the slope in the map
                map.put(slope, map.getOrDefault(slope, 0) + 1);

                // Keep track of the maximum points on a line from this point
                max = Math.max(max, map.get(slope));
            }

            // Update the global maximum considering all lines starting from point i
            maxOverall = Math.max(maxOverall, max);
        }

        return maxOverall + 1;  // Add 1 to include the starting point itself
    }
}
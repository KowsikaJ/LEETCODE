class Solution {
    public int minimumObstacles(int[][] grid) {
        int n = grid.length; // Number of rows
        int m = grid[0].length; // Number of columns

        // Directions for moving up, down, left, right
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // Priority Queue to implement the modified Dijkstra's algorithm
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Visited matrix
        boolean[][] vis = new boolean[n][m];
        pq.add(new int[]{grid[0][0], 0, 0}); // Start from (0, 0) with its cost
        vis[0][0] = true;

        // Modified Dijkstra's algorithm
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int steps = curr[0]; // Obstacles removed so far
            int x = curr[1];
            int y = curr[2];

            // If we reach the bottom-right corner
            if (x == n - 1 && y == m - 1) {
                return steps;
            }

            // Explore neighbors
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !vis[nx][ny]) {
                    vis[nx][ny] = true;
                    pq.add(new int[]{steps + grid[nx][ny], nx, ny});
                }
            }
        }
        return -1; // If no path exists (unlikely for a valid grid)
    }
}
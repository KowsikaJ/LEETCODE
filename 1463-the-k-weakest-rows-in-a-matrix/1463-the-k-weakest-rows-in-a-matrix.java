class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        // Step 1: Create a list to store pairs of (number of soldiers, row index)
        List<int[]> rowStrength = new ArrayList<>();
        
        // Step 2: Calculate the number of soldiers for each row
        for (int i = 0; i < mat.length; i++) {
            int soldiersCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soldiersCount++;
                } else {
                    break; // Stop counting when we encounter the first 0
                }
            }
            rowStrength.add(new int[] {soldiersCount, i});
        }
        
        // Step 3: Sort the list based on the number of soldiers and then by index
        Collections.sort(rowStrength, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; // Compare by number of soldiers
            } else {
                return a[1] - b[1]; // If same, compare by row index
            }
        });
        
        // Step 4: Extract the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowStrength.get(i)[1]; // Get the row index
        }
        
        // Step 5: Return the result array
        return result;
    }
}

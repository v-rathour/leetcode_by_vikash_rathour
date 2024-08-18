class Solution {
    public long maxPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        // Use a 1D array to store the results
        long[] dp = new long[m];

        // Initialize the dp array with the values of the first row
        for (int i = 0; i < m; i++) {
            dp[i] = points[0][i];
        }

        // Process each row starting from the second one
        for (int i = 1; i < n; i++) {
            long[] left = new long[m];
            long[] right = new long[m];

            // Calculate the left array
            left[0] = dp[0];
            for (int j = 1; j < m; j++) {
                left[j] = Math.max(left[j - 1] - 1, dp[j]);
            }

            // Calculate the right array
            right[m - 1] = dp[m - 1];
            for (int j = m - 2; j >= 0; j--) {
                right[j] = Math.max(right[j + 1] - 1, dp[j]);
            }

            // Update dp array for the current row
            for (int j = 0; j < m; j++) {
                dp[j] = points[i][j] + Math.max(left[j], right[j]);
            }
        }

        // Find the maximum value in the dp array
        long maxPoints = 0;
        for (int i = 0; i < m; i++) {
            maxPoints = Math.max(maxPoints, dp[i]);
        }

        return maxPoints;
    }
}
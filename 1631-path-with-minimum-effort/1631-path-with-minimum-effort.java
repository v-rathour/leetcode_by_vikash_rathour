import java.util.*;

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int[][] dis = new int[n][m];
        for (int[] row : dis) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        dis[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0, 0});

        int[] r = {-1, 1, 0, 0};
        int[] c = {0, 0, -1, 1};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int Effort = curr[0];
            int row = curr[1];
            int col = curr[2];

            for (int i = 0; i < 4; i++) {
                int nrow = row + r[i];
                int ncol = col + c[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                    int newEffort = Math.max(Math.abs(heights[nrow][ncol] - heights[row][col]), Effort);
                    if (newEffort < dis[nrow][ncol]) {
                        dis[nrow][ncol] = newEffort;
                        pq.offer(new int[]{newEffort, nrow, ncol});
                    }
                }
            }
        }

        return dis[n - 1][m - 1];
    }
}
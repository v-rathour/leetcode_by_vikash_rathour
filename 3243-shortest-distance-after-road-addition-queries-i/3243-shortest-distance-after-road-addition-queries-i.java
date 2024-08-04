import java.util.*;

class Solution {
    HashMap<Integer, List<Integer>> adj;
    int[] memo; 

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            adj.get(i).add(i + 1);
        }

        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            adj.get(s).add(e);
            
            
            memo = new int[n];
            Arrays.fill(memo, -1);

            int path = shortestPath(0);
            answer[i] = path;
        }
        return answer;
    }

    public int shortestPath(int src) {
        if (memo[src] != -1) return memo[src];
        
        int min = Integer.MAX_VALUE;
        
        for (int neighbor : adj.get(src)) {
            min = Math.min(min, shortestPath(neighbor));
        }

        if (min == Integer.MAX_VALUE) {
            return memo[src] = 0;
        }

        return memo[src] = min + 1;
    }
}

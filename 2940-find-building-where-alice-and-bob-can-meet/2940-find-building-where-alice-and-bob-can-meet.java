class Solution {
    public int[] leftmostBuildingQueries(int[] A, int[][] queries) {
        int n = A.length;
        List<int[]>[] que = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            que[i] = new ArrayList<>();
        }
        PriorityQueue<int[]> h = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[] res = new int[queries.length];
        Arrays.fill(res, -1);

        for (int qi = 0; qi < queries.length; qi++) {
            int i = queries[qi][0];
            int j = queries[qi][1];

            if (i < j && A[i] < A[j]) {
                res[qi] = j;
            } else if (i > j && A[i] > A[j]) {
                res[qi] = i;
            } else if (i == j) {
                res[qi] = i;
            } else {
                que[Math.max(i, j)].add(new int[]{Math.max(A[i], A[j]), qi});
            }
        }

        for (int i = 0; i < n; i++) {
            while (!h.isEmpty() && h.peek()[0] < A[i]) {
                int[] pair = h.poll();
                int qi = pair[1];
                res[qi] = i;
            }

            for (int[] q : que[i]) {
                h.offer(q);
            }
        }

        return res;
    }
}
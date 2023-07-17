class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        
        int n = nums1.length;
        int[][] nums = new int[n][2];
        
        for (int i = 0; i < n; ++i) {
            nums[i] = new int[] {nums1[i], nums2[i]};
        }
        
        Arrays.sort(nums, (a, b) -> b[1] - a[1]);
        long ans = 0, s = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (int j = 0; j < n; ++j) {
            
            s += nums[j][0];
            q.offer(nums[j][0]);
            
            if (q.size() == k) {
                ans = Math.max(ans, s * nums[j][1]);
                s -= q.poll();
            }
        }
        
        return ans;
    }
}
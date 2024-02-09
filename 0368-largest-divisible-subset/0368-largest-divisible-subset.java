class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        
        int[] prev = new int[n];
        Arrays.fill(prev, -1);
        
        int maxIndex = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        while (maxIndex != -1) {
            list.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        return list;
    }
}
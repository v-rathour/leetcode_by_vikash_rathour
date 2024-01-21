class Solution {
    
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int max = 0;
            for(int j = i-2;j>=0;j--){
                max = Math.max(max,dp[j]);
            }
            
            dp[i] = max+nums[i];
            ans = Math.max(ans,dp[i]);
        }
        
         return ans;
    }
    
    
}
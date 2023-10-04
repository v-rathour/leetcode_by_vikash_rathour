class Solution {
    public int rob(int[] nums) {
        int n = nums.length; 
        int dp[] = new int[n];
        
        if(n == 1){
            return nums[0];
        }
        
        for(int i = n-1;i>=0;i--){
            int max = Integer.MIN_VALUE;
            for(int j = i+2;j<n;j++){
                max = Math.max(max,nums[i]+dp[j]);
            }
            if(max == Integer.MIN_VALUE){
                dp[i] = nums[i];
            }
            else{
                dp[i] = max;
            }
        }
        
        
        return Math.max(dp[0],dp[1]);
    }
}
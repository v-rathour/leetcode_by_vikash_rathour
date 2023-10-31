class Solution {
    public boolean predictTheWinner(int[] nums) {
        int dp[][] = new int[nums.length][nums.length];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        
        return score(nums,0,nums.length-1,dp)>=0;
    }
    
    public int score(int[] nums,int i,int j,int[][]dp){
        if(i == j){
            return nums[i];
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int first = nums[i]-score(nums,i+1,j,dp);
        int second = nums[j]-score(nums,i,j-1,dp);
        
        return dp[i][j] = Math.max(first,second);
        
    } 
}
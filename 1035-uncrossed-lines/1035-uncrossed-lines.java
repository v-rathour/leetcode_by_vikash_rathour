class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int [][]dp = new int[nums1.length][nums2.length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        
        return LongestSubsequence(nums1,nums2,0,0,dp);
        
    }
    
    public int LongestSubsequence(int[] nums1,int[] nums2,int i,int j,int [][]dp){
        
        if(nums1.length == i || nums2.length == j){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if(nums1[i] == nums2[j]){
            ans = LongestSubsequence(nums1,nums2,i+1,j+1,dp)+1;
        }
        else{
            int fs = LongestSubsequence(nums1,nums2,i+1,j,dp);
            int ss = LongestSubsequence(nums1,nums2,i,j+1,dp);
            
            ans = Math.max(fs,ss);
        }
        
        return dp[i][j]=ans;
    }

}
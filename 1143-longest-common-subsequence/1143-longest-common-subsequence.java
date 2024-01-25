class Solution {
    
    public int longestCommonSubsequence(String s1, String s2) {
        
        int [][]dp = new int[s1.length()][s2.length()];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        
        return LongestSubsequence(s1,s2,0,0,dp);
        
    }
    
    public int LongestSubsequence(String s1,String s2,int i,int j,int [][]dp){
        
        if(s1.length() == i || s2.length() == j){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
             ans = LongestSubsequence(s1,s2,i+1,j+1,dp)+1;
        }
        else{
            int fs = LongestSubsequence(s1,s2,i+1,j,dp);
            int ls = LongestSubsequence(s1,s2,i,j+1,dp);
            
            ans = Math.max(fs,ls);
        }
        
        return dp[i][j] = ans;
        
    }
}
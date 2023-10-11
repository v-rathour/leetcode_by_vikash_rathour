class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        
        int dp[][] = new int[s1.length()][s2.length()];
        for(int a[] :dp){
            Arrays.fill(a,-1);
        }
        
        return LCS(s1,s2,0,0,dp);
    }
    
    public static int LCS(String s1,String s2,int i ,int j,int [][]dp){

        if(i == s1.length() || j == s2.length()){
            return 0 ;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans= 1+LCS(s1,s2,i+1,j+1,dp);
        }else{
            int fs = LCS(s1,s2,i+1,j,dp);
            int ss = LCS(s1,s2,i,j+1,dp);
            ans = Math.max(fs,ss);
        }
        return dp[i][j] = ans;

    }
}
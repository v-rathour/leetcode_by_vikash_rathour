class Solution {
    
    public int numDistinct(String s, String t) {
        
        int dp[][] = new int[s.length()+1][t.length()+1];
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<t.length();j++){
                dp[i][j] = -1;
            }
        }
        return DistinctSubsequence(s,t,0,0,dp);
        
    }
    
    public int DistinctSubsequence(String s1,String t1,int i,int j,int[][] dp){
        if(j == t1.length()){
            return 1;
        }
        
        if(i == s1.length()){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int inc = 0;
        int exc = 0;
        if(s1.charAt(i) == t1.charAt(j)){
            inc = DistinctSubsequence(s1,t1,i+1,j+1,dp);
        }
        exc = DistinctSubsequence(s1,t1,i+1,j,dp);
        return dp[i][j] = inc+exc;
    }
}
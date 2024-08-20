class Solution {
    
    public int solveforAlice(int []piles,int idx,int n ,int turn,int M,int [][][]dp){
        if(idx>=n){
            return 0;
        }
        
        if(dp[turn][idx][M] != -1){
            return dp[turn][idx][M];
        }
        
        int stone = 0;
        int result = turn == 1?-1:Integer.MAX_VALUE;
        
        for(int x = 1;x<=Math.min(2*M,n-idx);x++){
            
            stone += piles[idx+x-1];
            if(turn == 1){
                result = Math.max(result,stone+solveforAlice(piles,idx+x,n,0,Math.max(M,x),dp));
                
            }
            else{
                result = Math.min(result,solveforAlice(piles,idx+x,n,1,Math.max(M,x),dp));
            }
        }
        
        return dp[turn][idx][M] = result;
    }
    
    public int stoneGameII(int[] piles) {
        
        int [][][]dp = new int[2][101][101];
        
        for(int [][]ndp:dp){
            for(int []arr : ndp){
                Arrays.fill(arr,-1);
            }
        }
        
        return solveforAlice(piles,0,piles.length,1,1,dp);
        
    }
}
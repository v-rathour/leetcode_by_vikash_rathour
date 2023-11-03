class Solution {
    
    public int nthUglyNumber(int n) {
        
        int []dp = new int[n];
        dp[0] = 1;
        
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        
        int k = 1;
        while(k<n){
            int a = dp[p2]*2;
            int b = dp[p3]*3;
            int c = dp[p5]*5;
            
            dp[k] = Math.min(a,Math.min(b,c));
            
            if(dp[k] == a){
                p2++;
            }
        
            if(dp[k] == b){
                p3++;
            }
            
            if(dp[k] == c){
                p5++;
            }
            k++;
        }
        
        for(int i = 0;i<n;i++){
            System.out.print(dp[i]+" ");
        }
        System.out.println();
        
        return dp[n-1];
    }
}
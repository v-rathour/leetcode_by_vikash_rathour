class Solution {
    public int minCut(String s) {
        
        return PalindromePartition(s);
    }
     public static int PalindromePartition(String s){

        int n = s.length();

        boolean [][]dp = new boolean[n][n];

        for (int g = 0; g < n; g++) {
            for (int i = 0,j = g; j <n ; i++,j++) {
                if(g == 0){
                    dp[i][j] = true;
                }
                else if(g == 1){

                    dp[i][j] = s.charAt(i) == s.charAt(j);

                }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
            }
        }


//        suffix strategy

        int []store = new int[n];
        store[0] = 0;

        for (int i = 1; i < n; i++) {

            if(dp[0][i]){
                store[i] = 0;
            }
            else{

                int min = Integer.MAX_VALUE;

                for (int j = i; j>=1 ; j--) {
                    if(dp[j][i]){
                        if(store[j-1]<min){
                            min = store[j-1];
                        }
                    }
                }
                store[i] = min+1;
            }


        }

        return store[n-1];

    }
}
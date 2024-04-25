class Solution {
    public int longestIdealString(String s, int k) {
        
        int arr[] = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            arr[i] = s.charAt(i)-'a';
        }
        
        return LongesetSubString(arr,k);
    }
    
    public int LongesetSubString(int []arr,int k){
        
        int dp[] = new int[26];
        dp[arr[arr.length-1]] = 1;
        for(int i =arr.length-2;i>=0;i--){
            int lb = Math.max(0,arr[i]-k);
            int ub = Math.min(25,arr[i]+k);
            // System.out.println(lb+" "+ub);
            int max = 0;
            for(int j = lb;j<=ub;j++){
                max = Math.max(dp[j],max);
            }
            
            dp[arr[i]] = Math.max(max+1,dp[arr[i]]);
        }
        
        int ans = 0;
        for(int i= 0;i<26;i++){
            ans = Math.max(ans,dp[i]);
        }
        
        return ans;
        
    }
}
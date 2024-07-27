class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        
        long arr[][] = new long[26][26];
        
        for(long []a:arr){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        
        floyedWreshel(arr,original,changed,cost);
        
        long ans = 0;
        
        for(int i = 0;i<source.length();i++){
            char s = source.charAt(i);
            char t = target.charAt(i);
            
            if(s == t){
                continue;
            }
            
            if(arr[s-'a'][t-'a'] == Integer.MAX_VALUE){
                return -1;
            }
            
            ans += arr[s-'a'][t-'a'];
        }
        
        
        return ans;
    }
    
    public void floyedWreshel(long [][]arr,char[] original, char[] changed, int[] cost){
        for(int i = 0;i<original.length;i++){
            int s = original[i]-'a';
            int t = changed[i]-'a';
            
            arr[s][t] = Math.min(arr[s][t],(long)(cost[i]));
        }
        
        for(int k = 0;k<26;k++){
            for(int i = 0;i<26;i++){
                for(int j = 0;j<26;j++){
                    arr[i][j] = Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                }
            }
        }
    }
}
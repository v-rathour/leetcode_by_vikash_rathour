class Solution {
    public int[] countBits(int n) {
       int ans[] = new int[n + 1];
        
        ans[0] = 0;
        
        int binary = 1;
        for(int i = 1; i <= n; i++){
            
            if(binary * 2 == i){
                binary = i;
            }

            ans[i] = 1 + ans[i - binary];
        }
        return ans;
    }
}
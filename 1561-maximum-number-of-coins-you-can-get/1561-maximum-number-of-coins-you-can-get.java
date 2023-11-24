class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        
        Arrays.sort(piles);
        
        int i = 0;
        int j = n-2;
        int k = n-1;
        
        int ans = 0;
        while(i<j && j<k){
            ans += piles[j];
            i++;
            j -= 2;
            k -= 2;
        }
        
        return ans;
        
    }
}
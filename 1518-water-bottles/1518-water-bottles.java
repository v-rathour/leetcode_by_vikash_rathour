class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int fullbottol = numBottles;
        int emptybottol = 0;
        int ans = 0;
        while((fullbottol+emptybottol)>=numExchange){
            ans += fullbottol;
            
            emptybottol += fullbottol;
            
            fullbottol = emptybottol/numExchange;
            emptybottol = emptybottol%numExchange;
            
            
        }
        
        ans += fullbottol;
        
        return ans;
    }
}
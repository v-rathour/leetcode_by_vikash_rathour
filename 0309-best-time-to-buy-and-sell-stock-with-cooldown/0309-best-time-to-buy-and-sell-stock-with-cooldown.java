class Solution {
    
    public int maxProfit(int[] prices) {
        
        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0;
        
        for(int i = 1;i<prices.length;i++){
            
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            
            // change the bought state profit if it generate less charge to buy
            if(ocsp-prices[i] > obsp){
                nbsp = ocsp-prices[i];
            }
            else{
                nbsp = obsp;
            }
            
            // change the sell state profit if we will generate more profit on sell today
            if(obsp+prices[i]>ossp){
                nssp = obsp+prices[i];
            }else{
                nssp = ossp;
            }
            
            // wait after sell the one stock
            if(ocsp < ossp){
                ncsp = ossp;
            }
            else{
                ncsp = ocsp;
            }
            
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
            
        }
        
        return ossp;
    }
}
class Solution {
    public int integerReplacement(int k) {
        
        int res = 0;
        long n = (long)k;
        
        while(n != 1){
            
            if(n%2 == 0){
                n /= 2;
            }
            else if(n == 3){
                n = n-1;
            }
            else if((n&3) == 1){
                n = n-1;
            }
            else if((n&3) == 3){
                n = n+1;
            }
            
            res++;
        }
        
        return res;
        
    }
}
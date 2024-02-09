public class Solution {
    // you need treat n as an unsigned value
    
    
    public int reverseBits(int n) {
        int res = 0;
        int j = 0;
        boolean flag = false;
        for(int i = 31;i>=0;i--){
            
            int mask = (1<<i);
            
            if((n&mask) != 0){
                res |= (1<<j);
            }
            j++;
            
        }
        
        return res;
        
    }
}
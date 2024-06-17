class Solution {
    public boolean judgeSquareSum(int c) {
        
        long low = 0;
        long height = (long)Math.sqrt(c);
        
        while(low<=height){
            
            long val = low*low + height*height;
            
            if(val == c){
                return true;
            }
            
            if(val<c){
                low++;
            }
            
            if(val>c){
                height--;
            }
            
        }
        
        return false;
    }
}
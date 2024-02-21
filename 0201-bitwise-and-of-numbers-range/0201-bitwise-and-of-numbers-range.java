class Solution {
    
    public int rangeBitwiseAnd(int left, int right) {
        
        if(left == right){
            return left;
        }
        
       int count = 0;
       while(left != right){
           left >>=1;
           right>>=1;
           
           count++;
       }
        
        return right<<count;
        
    }
}
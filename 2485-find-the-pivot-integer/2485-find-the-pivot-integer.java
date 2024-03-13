class Solution {
    
    public int pivotInteger(int n) {
        
        int total_sum = 0;
        for(int i = 1;i<=n;i++){
            total_sum += i;
        }
        
        int pre = 0;
        int curr = 0;
        
        System.out.println(total_sum);
        
        for(int i = 1;i<=n;i++){
            curr += i;
            if(curr == (total_sum-pre)){
                return i;
            }
            pre += i;
        }
        
        return -1;
        
    }
}
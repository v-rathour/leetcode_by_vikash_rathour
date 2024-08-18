class Solution {
    
    
    public int nthUglyNumber(int n) {
        
        int []arr = new int[n+1];
        
        int i2 = 1;
        int i3 = 1;
        int i5 = 1;
        
        arr[1] = 1;
        for(int i = 2;i<=n;i++){
            int i2uglynumber = arr[i2]*2;
            int i3uglynumber = arr[i3]*3;
            int i5uglynumber = arr[i5]*5;
            
            int minuglynumber =   Math.min(i2uglynumber,Math.min(i3uglynumber,i5uglynumber));
            
            arr[i] = minuglynumber;
            
            if(i2uglynumber == minuglynumber){
                i2++;
            }
            
            if(i3uglynumber == minuglynumber){
                i3++;
            }
            
            if(i5uglynumber == minuglynumber){
                i5++;
            }
        }
        
        return arr[n];
        
    }
}
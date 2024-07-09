class Solution {
    public double averageWaitingTime(int[][] customers) {
        int start = 0;
        
        double rem = 0;
        for(int []a : customers){
            int s = a[0];
            int t = a[1];
            
            if(start<s){
                start = s;
            }
            start += t;
            rem += (start-s);
            
        }
        
        return rem/customers.length;
    }
}
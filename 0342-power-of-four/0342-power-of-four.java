class Solution {
    public boolean isPowerOfFour(int n) {
        
        int i=0;
        while(i<n){
            double num=Math.pow(4,i);
            if(num==n){
               return true;
            }
            // if 4^i is greater then num ,than n   
            if(num>n)
              return false;
            i++;
        }
        return false;
    }

}
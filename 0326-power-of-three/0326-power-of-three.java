class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n==2147483647)
        //    return false;
        int i=0;
        while(i<n){
            double num=Math.pow(3,i);
            if(num==n){
               return true;
            }
            // if 3^i is greater then num ,than n   
            if(num>n)
              return false;
            i++;
        }
        return false;
    }

}
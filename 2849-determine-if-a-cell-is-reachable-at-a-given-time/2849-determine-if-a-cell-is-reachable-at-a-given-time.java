class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        
       int srow = Math.abs(fx-sx);
       int scol = Math.abs(fy-sy);

       int ans = Math.max(srow,scol);
       // check the condition
       if(ans>t || (ans == 0 && (t<2 && t>0))){
           return false;
       }
       
        return true;
        
    }
}
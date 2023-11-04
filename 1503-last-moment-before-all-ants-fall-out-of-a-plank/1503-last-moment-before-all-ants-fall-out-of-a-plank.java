class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        
         int maxleft = Integer.MIN_VALUE;
         int minRight = Integer.MAX_VALUE;
        
         for(int i = 0;i<left.length;i++){
               maxleft = Math.max(maxleft,left[i]);
         }
        
        for(int i = 0;i<right.length;i++){
            minRight = Math.min(minRight,right[i]);
        }
        
        return Math.max(maxleft,n-minRight);
        
    }
}
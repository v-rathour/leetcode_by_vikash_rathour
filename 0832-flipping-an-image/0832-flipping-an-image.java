class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int ans[][] = new int[n][n];
        for(int i=0;i<image.length;i++){
            
            for(int j = image.length-1;j >= 0;j--){
                if(image[i][j] == 0){
                    ans[i][n-1-j] = 1;
                }
                else{
                    ans[i][n-1-j] = 0;
                }
            }
        }
        
        return ans;
    }
}
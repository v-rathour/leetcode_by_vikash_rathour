class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int ans = 0;
        
        for(int i = 0;i<n;i++){
            
            for(int j = 0;j<m;j++){
                
                if(matrix[i][j] != 0 && i>0){
                    matrix[i][j] += matrix[i-1][j];
                }
                
            }
            
            int []lastRow = matrix[i].clone();
            
            Arrays.sort(lastRow);

            for(int k = 0;k<m;k++){
                ans = Math.max(ans,lastRow[k]*(m-k));
            }
        }
        
        return ans;
    }
}
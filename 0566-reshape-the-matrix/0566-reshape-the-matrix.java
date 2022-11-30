class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(n*m != r*c)
            return mat;
        int row=0;
        int col=0;
        int arr[][]=new int[r][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[row][col]=mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return arr;
        
        
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        int x=0;
        int y=0;
        // if 0 present in first row than change the value of the x
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                x=1;
                break;
            }
        }
         // if 0 present in first col than change the value of the y
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                y=1;
                break;
            }
        }
        // change the the value of (i,0) and (0,i) cell crossponding cell in which 0 present 
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        // Make all element zero if in this row zero is present
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }
        // Make all element zero if in this coloum zero is present
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        if(x==1){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
        if(y==1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}
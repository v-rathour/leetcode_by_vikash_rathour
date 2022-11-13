class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //Transpose of the original matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //Swap of the value matrix[0][1]=matrix[1][0]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Reverse of the matrix according to row wise
        for(int i=0;i<matrix.length;i++)
            reverse(matrix[i]);
      }
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
class Solution {
    public int[][] generateMatrix(int n) {
       
        int arr[][]=new int[n][n];
        return traverse(arr);
        
    }
    public int[][] traverse(int arr[][]){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total=arr.length*arr.length;
        int count=1;
        while(count<=total){
            for(int i=minc;i<=maxc && count<=total;i++){
                arr[minc][i]=count;
                count++;
            }
            minr++;
            for(int i=minr;i<=maxr && count<=total;i++){
                arr[i][maxc]=count;
                count++;
                
            }
            maxc--;
            for(int i=maxc;i>=minc && count<=total;i--){
                arr[maxr][i]=count;
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count<=total;i--){
                arr[i][minc]=count;
                count++;
            }
            minc++;
        }
        return arr;
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return print_spiral(matrix);
    }
    public static ArrayList<Integer> print_spiral(int arr[][]){
        ArrayList<Integer> a = new ArrayList<>();
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total=(arr.length*arr[0].length);
        int count=0;
        while(count<total){ 
            for(int i=minc;i<=maxc && count<total;i++){
                // add the element in Arraylist
                a.add(arr[minr][i]);
                count++;
            }
            minr++;
            for(int i=minr;i<=maxr && count<total;i++){
                // add the element in Arraylist
                a.add(arr[i][maxc]);
                count++;
            }
            maxc--;
            for(int i=maxc;i>=minc && count<total;i--){
                // add the element in Arraylist
                a.add(arr[maxr][i]);
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count<total;i--){
                // add the element in Arraylist
                a.add(arr[i][minc]);
                count++;
            }
            minc++;
        }
        return a;
    }
}
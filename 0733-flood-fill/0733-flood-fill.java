class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited=new boolean[image.length][image[0].length];
        fill_color(image,sr,sc,image[sr][sc],color,visited);
        return image;
    }
    
    public void fill_color(int[][] image,int row,int col,int element,int color,boolean[][] visited){
        if(row>=image.length || col>=image[0].length || row<0 || col<0 || image[row][col]!=element || visited[row][col]==true){
            
            return;
        }
        visited[row][col]=true;
        image[row][col]=color;
       
        fill_color(image,row,col-1,element,color,visited);
        fill_color(image,row-1,col,element,color,visited);
        fill_color(image,row,col+1,element,color,visited);
        fill_color(image,row+1,col,element,color,visited);
    }
    
}
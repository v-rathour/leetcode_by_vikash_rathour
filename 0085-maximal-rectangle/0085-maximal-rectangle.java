class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int arr[]=new int[matrix[0].length];
        int n=matrix.length;
        int ans=0;
        
       for(int i=n-1;i>=0;i--){
           for(int j=0;j<arr.length;j++){
               if(matrix[i][j]=='1'){
                   arr[j] +=1;
               }
               else{
                   arr[j]=0;
               }
           }
           int ans1=largestRectangleArea(arr);
           ans=Math.max(ans,ans1);
       }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        
        int[] rb=new int[heights.length];
        
        Stack<Integer> st=new Stack<>();
        st.push(heights.length-1);
        rb[st.peek()]=heights.length;
        
        for(int i=heights.length-2;i>=0;i--){
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
                
            }
            if(st.size()==0){
                rb[i]=heights.length;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
            
        }
        
        int[] lb=new int[heights.length];
        st=new Stack<>();
        st.push(0);
        
        lb[0]=-1;
        for(int i=1;i<heights.length;i++){
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
                
            }
            if(st.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=st.peek();
            }
            st.push(i);
            
        }
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int width=rb[i]-lb[i]-1;
            int area=heights[i]*width;
            if(maxArea<area){
                maxArea=area;
            }
        }
        
        return maxArea;
    }
}
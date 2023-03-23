class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return Next_greater(temperatures);
    }
    public int[] Next_greater(int[] arr) {
        int newarr[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        newarr[arr.length-1]=0;
        for (int i = arr.length-2; i>=0; i--) {
            while(st.size()>0 && arr[st.peek()]<=arr[i]) {
                st.pop();
            }
            if(st.size()==0){
                newarr[i]=0;
            }
            else{
                newarr[i]=st.peek()-i;
            }
            st.push(i);
        }
        return newarr;
    }
}
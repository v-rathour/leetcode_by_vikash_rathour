class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // stack create to store the element of the of pushed array
        Stack<Integer> st=new Stack<>();
        // it is initializa for iterate the popped array
        int j=0;
        
        for(int i=0;i<pushed.length;i++){
            
            if(popped[j]!=pushed[i]){
                st.push(pushed[i]);
            }
            else{
                j++;
                while(st.size()>0 && st.peek()==popped[j]){
                    st.pop();
                    j++;
                }
                
            }
        }
       
        if(st.size()>0){
            return false;
        }
        return true;
    }
}
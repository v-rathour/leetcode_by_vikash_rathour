class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st=new Stack<>();
       
        int j=0;
        
        
        Stack<Integer> pushs=new Stack<>();
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
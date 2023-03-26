class Solution {
   
    public int longestValidParentheses(String s) {
        return paranthesis(s);
    }
    public int paranthesis(String str){
        // store the character
        Stack<Character> st=new Stack<>();
        // store the indx where create the problem
        Stack<Integer> indx=new Stack<>();
        int max=0;
        indx.push(-1);
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' ) {
                indx.push(i);
                st.push(ch);
            }
            else{
               
                if(!st.isEmpty()&& st.peek()=='(' ){
                    st.pop();
                    indx.pop();
                    max=Math.max(max,i-indx.peek());
                }
                else{
                   indx.push(i); 
                }
           }
       
       }
         return max;
    }
}
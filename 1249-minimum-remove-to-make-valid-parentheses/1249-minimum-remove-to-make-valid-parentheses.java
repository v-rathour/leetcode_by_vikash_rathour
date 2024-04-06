class Solution {
    class Pair{
        int indx;
        char ch;
        
        Pair(int indx,char ch){
            this.indx = indx;
            this.ch = ch;
        }
    }
    public String minRemoveToMakeValid(String s) {
        char[] arr = new char[s.length()];
        
        
        Stack<Pair> st = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ')'){
                if(!st.isEmpty() && st.peek().ch == '('){
                    arr[st.peek().indx] = '(';
                    arr[i] = ')';
                    st.pop();
                }
            }
            else if(c == '('){
                st.push(new Pair(i,c));
            }
            else{
                arr[i] = c; 
            }
        }
        String str = "";
        for(int i = 0;i<s.length();i++){
            if(arr[i] != '\u0000'){
                str  += arr[i];
            }
        }
        
        return str;
        
    }
}
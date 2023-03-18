class Solution {
    public String removeStars(String s) {
        if(s.length()==0){
            return "";
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        if(st.isEmpty()){
            return "";
        }
        String str="";
        while(!st.isEmpty()){
            str=st.peek()+str;
            st.pop();
        }
        return str;
    }
}
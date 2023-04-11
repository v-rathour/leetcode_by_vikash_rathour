class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                st.pop();
            }
            else 
            st.push(s.charAt(i));
        }
        if(st.size()==0){
            return "";
        }
        
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}
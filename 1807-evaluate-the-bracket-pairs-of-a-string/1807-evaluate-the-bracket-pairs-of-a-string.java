class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
         HashMap<String,String> map=new HashMap<>();
         for(int i=0;i<knowledge.size();i++){
             List<String> list=knowledge.get(i);
             map.put(list.get(0),list.get(1));
         }
        String ans="";
        String str="";
        
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                st.push(ch);
            }
            else if(st.size()>0 && ch!=')'){
                str +=ch;
            }
            else if(ch==')'){
                 if(map.containsKey(str)){
                     ans +=map.get(str);
                 }
                else{
                   ans +='?'; 
                }
                str="";
                st.pop();
            }
            else{
                ans +=ch;
            }
            
        }
        
        return ans;
        
    }
}
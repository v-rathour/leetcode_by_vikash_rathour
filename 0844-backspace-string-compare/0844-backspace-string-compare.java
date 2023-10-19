class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == '#'){
                if(st1.size()>0){
                    st1.pop();
                }
            }
            else{
                st1.push(ch);
            }
        }
        
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            
            if(ch == '#'){
                if(st2.size()>0){
                    st2.pop();
                }
            }
            else{
                st2.push(ch);
            }
        }
        
        if(st1.size() != st2.size()){
            return false;
        }
        
        while(!st1.isEmpty()){
            char ch1 = st1.pop();
            char ch2 = st2.pop();
            
            if(ch1 != ch2){
                return false;
            }
        }
        
        return true;
        
    }
}
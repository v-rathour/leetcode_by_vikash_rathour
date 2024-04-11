class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        int mr = getMin(s);
        
        List<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        printValidParanthsis(mr,s,ans,set);
        return ans;
        
    }
    
    public void printValidParanthsis(int mr,String s,List<String> list,HashSet<String> set){
        
        if(set.contains(s))
            return;
        set.add(s);
        
        if(mr == 0){
            int nmr = getMin(s);
            if(nmr == 0 && !list.contains(s)){
                list.add(s);
            }
            return;
        }
        
        for(int i = 0;i<s.length();i++){
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            if(!set.contains(left+right)){
                printValidParanthsis(mr-1,left+right,list,set);
            }
        }
        
    }
    
    public int getMin(String s){
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.size() == 0){
                    st.push(ch);
                }else if(st.peek() == ')'){
                    st.push(ch);
                }
                else if(st.peek() == '('){
                    st.pop();
                }
            }
        }
        
        
        return st.size();
    }
    
}
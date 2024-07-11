class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> open = new Stack<>();
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                open.push(ans.length());
            }
            else if(ch == ')'){
                
                int start = open.pop();
                StringBuilder left = new StringBuilder(ans.substring(0,start));
                StringBuilder right = new StringBuilder(ans.substring(start,ans.length()));
                right.reverse();
                
                ans = new StringBuilder();
                ans.append(left);
                ans.append(right);
            }
            else{
                ans.append(ch+"");
            }
        }
        
        return ans.toString();
    }
}
class Solution {
    public int maxDepth(String s) {
        int open = 0;
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else if(ch == ')'){
                open--;
            }
            
            ans = Math.max(open,ans);
        }
        
        return ans;
        
    }
}
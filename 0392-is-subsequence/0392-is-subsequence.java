class Solution {
    
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0){
            return true;
        }
        
        int idx = 0;
        boolean flag = false;
        
        for(int i = 0;i<t.length();i++){
            
             char ch = t.charAt(i);
            
             if(s.charAt(idx) == ch){
                 idx++;
                 if(idx == s.length()){
                     flag = true;
                     break;
                 }
             }
            
             
        }
        
        
        return flag;
    }
}
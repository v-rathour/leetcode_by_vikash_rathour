class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        if(s.length() == 1 || s.length() != goal.length()){
            return false;
        }
        
        if(s.length() == 2){
            String str = s.charAt(1)+""+s.charAt(0);
            if(str.equals(goal)){
                return true;
            }
            return false;
        }
        
        HashMap<Character,Integer> set_s = new HashMap<>();
        HashMap<Character,Integer> set_goal = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set_s.containsKey(c) == false){
                set_s.put(c,1);
            }
            else{
                set_s.put(c,set_s.get(c)+1);
            }
        }
        
        for(int i=0;i<goal.length();i++){
            char c = goal.charAt(i);
            if(set_goal.containsKey(c) == false){
                set_goal.put(c,1);
            }
            else{
                set_goal.put(c,set_goal.get(c)+1);
            }
        }
        
        if(set_s.size() != set_goal.size()){
            return false;
        }
        
        if(set_s.size() == 1){
            return true;
        }
        
        for(char ch:set_s.keySet()){
            int value = set_s.get(ch);
            if(set_goal.containsKey(ch)==false || value != set_goal.get(ch)){
                return false;
            }
        }
     
        int diff = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i)){
                diff++;
            }
        }
        
        if(diff == 0){
            for(char ch: set_s.keySet()){
                if(set_s.get(ch) > 1){
                    return true;
                }
            }
            
            return false;
        }
        
        if(diff == 2){
            return true;
        }
        
        return false;
    }
}
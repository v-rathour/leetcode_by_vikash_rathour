class Solution {
    
    public int minSteps(String s, String t) {
        
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!smap.containsKey(ch)){
                smap.put(ch,1);
            }
            else{
                smap.put(ch,smap.get(ch)+1);
            }
        }
        
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!tmap.containsKey(ch)){
                tmap.put(ch,1);
            }
            else{
                tmap.put(ch,tmap.get(ch)+1);
            } 
        }
         int count = 0;
         for(char ch : smap.keySet()){
             
             if(tmap.containsKey(ch)){
                 if(smap.get(ch)>tmap.get(ch)){
                     count += smap.get(ch)-tmap.get(ch);
                 }
             }
             else{
                 count += smap.get(ch);
             }
             
         }
        
         if(count>=2){
             return count;
         }
        else if(count == 1){
            
           
            
            int f = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) != t.charAt(i)){
                    f++;
                }
            }
            
            if(f>1){
                return 1;
            }
                return 2;
        }
        else{
            
            if(tmap.size() != s.length()){
                return 0;
            }
            
            int f = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) != t.charAt(i)){
                    f++;
                }
            }
            
            if(f>=1){
                return 0;
            }
            
            return 2;
        }
        
    }
}
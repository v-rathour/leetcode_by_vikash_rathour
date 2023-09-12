class Solution {
    
    public int minDeletions(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            if(map.containsKey(ch) == false){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
            
        }
        
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(char ch :map.keySet()){
            
            int fre = map.get(ch);
            
            while(set.contains(fre) && fre>0){
                fre--;
                count++;
            }
            
            set.add(fre);
        }
        
         return count;
        
    }
}
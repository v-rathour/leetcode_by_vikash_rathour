class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            
            if(map.containsKey(ch1)==false){
                if(set.contains(ch2)){
                    return false;
                }
                map.put(ch1,ch2);
                set.add(ch2);
            }
            else{
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
   
}
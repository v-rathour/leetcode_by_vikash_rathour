class Solution {
    public boolean halvesAreAlike(String s) {
        
        HashSet<Character> set = new HashSet<>();
        String str = "aeiouAEIOU";
        
        for(int i = 0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        
        int size = s.length()/2;
        
        int firsthalf = 0;
        for(int i = 0;i<size;i++){
            if(set.contains(s.charAt(i))){
                firsthalf++;
            }
            
        }
        
        int secondhalf = 0;
        for(int i = size;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                secondhalf++;
            }
        }
        
        if(secondhalf == firsthalf){
            return true;
        }
        
        return false;
    }
}
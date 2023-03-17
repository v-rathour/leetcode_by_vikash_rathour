class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)==false){
                map.put(ch,1);
                
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        int fre=map.get(s.charAt(0));
        for(char ch:map.keySet()){
            if(map.get(ch)!=fre)
                return false;
        }
        return true;
    }
}
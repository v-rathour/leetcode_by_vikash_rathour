class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char ans='\0';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)==false){
                map.put(ch,1);
                
            }
            else{
                map.put(ch,map.get(ch)+1);
                ans=ch;
                break;
            }
        }
        return ans;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        
        int odd = 0;
        int count = 0;
        for(char ch : map.keySet()){
            if(map.get(ch)%2 != 0 &&  odd == 0){
                odd  = 1;
                count += map.get(ch);
            }
            else if(map.get(ch)%2 == 0){
                count += map.get(ch);
            }
            else{
                count += ((map.get(ch)/2)*2);
            }
        }
        
        return count;
    }
}
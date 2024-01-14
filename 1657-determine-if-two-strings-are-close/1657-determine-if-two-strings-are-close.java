class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i = 0;i<word1.length();i++){
            char ch = word1.charAt(i);
            if(!map1.containsKey(ch))map1.put(ch,1);else map1.put(ch,map1.get(ch)+1);
        }
        
        for(int i = 0;i<word2.length();i++){
            char ch = word2.charAt(i);
            if(!map2.containsKey(ch))map2.put(ch,1);else map2.put(ch,map2.get(ch)+1);
        }
        
        if(map1.size() != map2.size()){
            return false;
        }
        
        for(char ch : map1.keySet()){
            if(!map2.containsKey(ch)){
                return false;
            }
        }
        
        int[] freq1 = new int[map1.size()];
        int[] freq2 = new int[map1.size()];
        
        int j = 0;
        for(char ch : map1.keySet()){
            freq1[j] = map1.get(ch);
            j++;
        }
        
        j = 0;
        for(char ch : map2.keySet()){
            freq2[j] = map2.get(ch);
            j++;
        }
        
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        for(int i = 0;i<freq1.length;i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        
        return true;
    }
}
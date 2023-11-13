class Solution {
    public String sortVowels(String s) {
        
        String str = s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(set.contains(ch)){
                if(s.charAt(i) == ch){
                    pq.add(ch);
                }
                else{
                    pq.add((char)(ch-32));
                }
                
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(set.contains(ch)){
                char c = pq.remove();
                ans.append(c);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        
        return ans.toString();
        
    }
}
class Solution {
    
    class Pair implements  Comparable<Pair>{
        
        char ch;
        int freq;
        
        Pair(char ch,int freq){
            this.ch = ch;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair o) {
            return o.freq-this.freq;
        }
    }
    
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(char ch : map.keySet()){
            pq.add(new Pair(ch,map.get(ch)));
        }
        
        StringBuilder answer = new StringBuilder();
        
        while(!pq.isEmpty()){
            Pair rem = pq.remove();
            for(int i = 0;i<rem.freq;i++){
                answer.append(rem.ch);
            }
        }
        
        return answer.toString();
        
        
        
    }
}